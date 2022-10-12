/*
 * Copyright (c) 10/12/22, 1:12 PM.
 * Author: Prasun Kanti Howlader
 * All rights reserved
 */

package spcbl.org.inventory.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import spcbl.org.inventory.service.DeviceCategoryService;

@Controller
public class CategoryController {
    @Autowired
    DeviceCategoryService deviceCategoryService;
    @RequestMapping("/category")
    public ModelAndView category(){
        ModelAndView modelAndView = new ModelAndView();
        System.out.println(deviceCategoryService.getCategoryList());
        modelAndView.addObject("categoryList",deviceCategoryService.getCategoryList());
        return modelAndView;
    }

}
