package spcbl.org.bd.osp.helper;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.web.multipart.MultipartFile;
import spcbl.org.bd.osp.model.WeaklyPlanning;
import spcbl.org.bd.osp.model.WeaklyPlanning;

import java.io.IOException;
import java.io.InputStream;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class WeaklyExcelHelper {
    public static String TYPE = "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet";

    static String[] HEADERs = { "mcName", "mcStatus", "itemName", "deno","totalpRINTED","fo" };


    static String SHEET = "ospprinting";
    public static boolean hasExcelFormat(MultipartFile file) {
        if (!TYPE.equals(file.getContentType())) {
            System.out.println("Invalid file format"+file.getContentType());
            return false;
        }
        return true;
    }
    public static List<WeaklyPlanning> excelToTutorials(InputStream is, LocalDate sDate, LocalDate eDate) {
        try {
            System.out.println("test");
            Workbook workbook = new XSSFWorkbook(is);
            System.out.println(is);
            Sheet sheet = workbook.getSheet(SHEET);
            System.out.println(sheet);
            Iterator<Row> rows = sheet.iterator();
            List<WeaklyPlanning> weaklyPlannings = new ArrayList<>();
            int rowNumber = 0;
            while (rows.hasNext()) {
                Row currentRow = rows.next();
                // skip header
                if (rowNumber == 0) {
                    rowNumber++;
                    continue;
                }
                Iterator<Cell> cellsInRow = currentRow.iterator();
                WeaklyPlanning weaklyPlanning = new WeaklyPlanning();
                weaklyPlanning.setStartDate(sDate);
                weaklyPlanning.setEndDate(eDate);
                int cellIdx = 0;
                while (cellsInRow.hasNext()) {
                    Cell currentCell = cellsInRow.next();
                    switch (cellIdx) {
                      /*  case 0:
                            dailyProduction.setId((int) currentCell.getNumericCellValue());
                            break;*/

                        case 0:

                            weaklyPlanning.setMachineName(currentCell.getStringCellValue());

                            break;

                        case 1:
                            weaklyPlanning.setTotalPrinting((int)currentCell.getNumericCellValue());
                            break;

                        default:
                            break;
                    }
                    cellIdx++;
                }

                weaklyPlannings.add(weaklyPlanning);
            }
            workbook.close();
            return weaklyPlannings;
        } catch (IOException e) {
            System.out.println("Errtor"+e.getMessage());
            throw new RuntimeException("fail to parse Excel file: " + e.getMessage());
        }
    }
}
