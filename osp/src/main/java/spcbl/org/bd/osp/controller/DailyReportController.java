package spcbl.org.bd.osp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import spcbl.org.bd.osp.model.DailyProduction;
import spcbl.org.bd.osp.service.DailyProductionService;


import java.util.List;

@RestController
public class DailyReportController {
    private final DailyProductionService dailyProductionService;

    public DailyReportController(DailyProductionService dailyProductionService) {
        this.dailyProductionService = dailyProductionService;
    }
    @RequestMapping(path="/dailyreport", method= RequestMethod.GET)
    public List<DailyProduction> dailyReport(){
        return this.dailyProductionService.listDailyProduction();
    }
}
