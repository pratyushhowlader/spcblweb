package spcbl.org.bd.osp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import spcbl.org.bd.osp.service.DailyProductionService;
import spcbl.org.bd.osp.service.DwReportService;


import java.util.List;

@Controller
public class HomeController {
 /* private final DailyProductionService dailyProductionService;

    public HomeController(DailyProductionService dailyProductionService) {
        this.dailyProductionService = dailyProductionService;
    }*/
    private final DwReportService dwReportService;

    public HomeController(DwReportService dwReportService) {
        this.dwReportService = dwReportService;
    }

    @GetMapping("/")
   /* public String home(){

        return "home.html";

    }*/
    public ModelAndView home(){
        ModelAndView modelAndView = new ModelAndView();

        modelAndView.addObject(this.dwReportService.dwReport());
        modelAndView.addObject("productionlist",this.dwReportService.dwReport());
        modelAndView.setViewName("home.html");
        return modelAndView;

    }

   /* @RequestMapping("/addEmployee")
    public String addEmployee(@RequestParam("empName") String empName, Model model){
        model.addAttribute("empName", empName);
        return "employee.html";
    }*/
}
