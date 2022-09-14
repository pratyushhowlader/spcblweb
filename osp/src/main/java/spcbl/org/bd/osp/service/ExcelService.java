package spcbl.org.bd.osp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import spcbl.org.bd.osp.helper.ExcelHelper;
import spcbl.org.bd.osp.model.DailyProduction;
import spcbl.org.bd.osp.repository.DailyProductionRepo;


import java.io.IOException;
import java.util.List;
@Service
public class ExcelService {
    @Autowired
    DailyProductionRepo repository;
    public void save(MultipartFile file) {
        try {
            List<DailyProduction> tutorials = ExcelHelper.excelToTutorials(file.getInputStream());
            repository.saveAll(tutorials);
        } catch (IOException e) {
            throw new RuntimeException("fail to store excel data: " + e.getMessage());
        }
    }
    public List<DailyProduction> getAllTutorials() {
        return repository.findAll();
    }
}
