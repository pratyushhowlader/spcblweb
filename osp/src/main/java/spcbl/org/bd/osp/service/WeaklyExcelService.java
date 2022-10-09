package spcbl.org.bd.osp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import spcbl.org.bd.osp.helper.DailyExcelHelper;
import spcbl.org.bd.osp.helper.WeaklyExcelHelper;
import spcbl.org.bd.osp.model.DailyProduction;
import spcbl.org.bd.osp.model.WeaklyPlanning;
import spcbl.org.bd.osp.repository.DailyProductionRepo;
import spcbl.org.bd.osp.repository.WeaklyPlanningRepo;

import java.io.IOException;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Service
public class WeaklyExcelService {
    @Autowired
    WeaklyPlanningRepo repository;
    public void save(MultipartFile file, LocalDate sdate, LocalDate edate) {
        try {
            List<WeaklyPlanning> tutorials = WeaklyExcelHelper.excelToTutorials(file.getInputStream(),sdate,edate);
            repository.saveAll(tutorials);
        } catch (IOException e) {
            throw new RuntimeException("fail to store excel data: " + e.getMessage());
        }
    }
    public List<WeaklyPlanning> getAllTutorials() {
        return repository.findAll();
    }
}
