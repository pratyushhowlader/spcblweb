package spcbl.org.bd.osp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import spcbl.org.bd.osp.helper.DailyExcelHelper;
import spcbl.org.bd.osp.helper.WeaklyExcelHelper;
import spcbl.org.bd.osp.message.ResponseMessage;
import spcbl.org.bd.osp.service.DailyExcelService;
import spcbl.org.bd.osp.service.WeaklyExcelService;


import java.util.Date;

@CrossOrigin("http://localhost:8080")
@Controller
@RequestMapping("/api/excel")
public class ExcelController {
    @Autowired
    DailyExcelService fileService;
    @Autowired
    WeaklyExcelService weaklyExcelService;
    @PostMapping("/daily")
    public ResponseEntity<ResponseMessage> uploadFile(@RequestParam("ddate") Date ddate, @RequestParam("file") MultipartFile file) {
        String message = "";
        if (DailyExcelHelper.hasExcelFormat(file)) {
            try {
                System.out.println(ddate);
                fileService.save(file,ddate);
                message = "Uploaded the file successfully: " + file.getOriginalFilename();
                return ResponseEntity.status(HttpStatus.OK).body(new ResponseMessage(message));
            } catch (Exception e) {
                message = "Could not upload the file: " + file.getOriginalFilename() + "!";
                return ResponseEntity.status(HttpStatus.EXPECTATION_FAILED).body(new ResponseMessage(message));
            }
        }
        message = "Please upload an excel file!";
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new ResponseMessage(message));
    }

    @PostMapping("/weakly")
    public ResponseEntity<ResponseMessage> uploadFileWeakly(@RequestParam("sdate") Date sdate, @RequestParam("edate") Date edate, @RequestParam("file") MultipartFile file) {
        String message = "";
        if (WeaklyExcelHelper.hasExcelFormat(file)) {
            try {
                System.out.println(sdate);
                weaklyExcelService.save(file,sdate,edate);
                message = "Uploaded the file successfully: " + file.getOriginalFilename();
                return ResponseEntity.status(HttpStatus.OK).body(new ResponseMessage(message));
            } catch (Exception e) {
                message = "Could not upload the file: " + file.getOriginalFilename() + "!";
                return ResponseEntity.status(HttpStatus.EXPECTATION_FAILED).body(new ResponseMessage(message));
            }
        }
        message = "Please upload an excel file!";
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new ResponseMessage(message));
    }

}
