/*
 * Copyright (c) 10/12/22, 1:12 PM.
 * Author: Prasun Kanti Howlader
 * All rights reserved
 */

package spcbl.org.inventory.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.util.MimeTypeUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import spcbl.org.inventory.model.DeviceCategory;
import spcbl.org.inventory.service.DeviceCategoryService;

import javax.websocket.server.PathParam;
import java.util.HashMap;
import java.util.Map;

@Controller
public class CategoryController {
    @Autowired
    DeviceCategoryService deviceCategoryService;
    @RequestMapping("/category")
    public ModelAndView category(){
        ModelAndView modelAndView = new ModelAndView();

        modelAndView.addObject("categoryList",deviceCategoryService.getCategoryList());
        modelAndView.setViewName("category/category.html");
        return modelAndView;
    }

    @PostMapping("/createcategory")
    public DeviceCategory createCategory(@ModelAttribute DeviceCategory deviceCategory) {
        return deviceCategoryService.addNewCategory(deviceCategory);
    }


    @RequestMapping(value = "/deletecategory/{id}",method = {RequestMethod.GET, RequestMethod.PUT,RequestMethod.DELETE},headers = "Accept=application/json")
    @CrossOrigin(origins = "*")
      public ResponseEntity<Map<String,Boolean>> deleteEmployee(@PathVariable("id") Long id) {
        boolean deleted = false;
        deleted =deviceCategoryService.deleteCategory(id);
        Map<String,Boolean> response = new HashMap<>();
        response.put("deleted", deleted);
        return ResponseEntity.ok(response);
    }

   /* @GetMapping("/employees/{id}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable Long id) {
        Employee employee = null;
        employee = employeeService.getEmployeeById(id);
        return ResponseEntity.ok(employee);
    }*/

    @PutMapping("/updatecategory/{id}")
    public DeviceCategory updateEmployee(@PathVariable Long id,
                                                   @ModelAttribute DeviceCategory deviceCategory) {

        return deviceCategoryService.updateCategory(id, deviceCategory);
    }

}
