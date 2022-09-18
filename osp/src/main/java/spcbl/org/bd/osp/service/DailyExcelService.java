package spcbl.org.bd.osp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import spcbl.org.bd.osp.helper.DailyExcelHelper;
import spcbl.org.bd.osp.model.DailyProduction;
import spcbl.org.bd.osp.repository.DailyProductionRepo;


import java.io.IOException;
import java.util.Date;
import java.util.List;
@Service
public class DailyExcelService {
    @Autowired
    DailyProductionRepo repository;
    public void save(MultipartFile file, Date ddate) {
        try {
            List<DailyProduction> tutorials = DailyExcelHelper.excelToTutorials(file.getInputStream(),ddate);
            repository.saveAll(tutorials);
        } catch (IOException e) {
            throw new RuntimeException("fail to store excel data: " + e.getMessage());
        }
    }
    public List<DailyProduction> getAllTutorials() {
        return repository.findAll();
    }
}
