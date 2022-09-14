package spcbl.org.bd.osp.service;

import org.springframework.stereotype.Service;
import spcbl.org.bd.osp.model.DailyProduction;
import spcbl.org.bd.osp.repository.DailyProductionRepo;


import java.util.List;
@Service
public class DailyProductionImp implements DailyProductionService {
    private final DailyProductionRepo dailyProductionRepo;

    public DailyProductionImp(DailyProductionRepo dailyProductionRepo) {
        this.dailyProductionRepo = dailyProductionRepo;
    }

    @Override
    public List<DailyProduction> listDailyProduction() {
        return this.dailyProductionRepo.findAll();
    }
}
