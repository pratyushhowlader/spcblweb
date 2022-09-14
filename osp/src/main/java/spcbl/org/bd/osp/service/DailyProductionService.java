package spcbl.org.bd.osp.service;

import org.springframework.stereotype.Service;
import spcbl.org.bd.osp.model.DailyProduction;


import java.util.List;

public interface DailyProductionService {
    public List<DailyProduction> listDailyProduction();
}
