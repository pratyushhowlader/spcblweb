/*
 * Copyright (c) 10/12/22, 1:36 PM.
 * Author: Prasun Kanti Howlader
 * All rights reserved
 */

package spcbl.org.inventory.service;

import org.springframework.stereotype.Service;
import spcbl.org.inventory.entity.DeviceCategoryEntity;
import spcbl.org.inventory.model.DeviceCategory;
import spcbl.org.inventory.repository.DeviceCategoryRepo;

import java.util.List;
import java.util.stream.Collectors;
@Service
public class DeviceCategoryServiceImpl implements DeviceCategoryService {
    private final DeviceCategoryRepo categoryRepo;

    public DeviceCategoryServiceImpl(DeviceCategoryRepo categoryRepo) {
        this.categoryRepo = categoryRepo;
    }

    @Override
    public DeviceCategory addNewCategory(DeviceCategory category) {
        return null;
    }

    @Override
    public boolean deleteCategory(Long id) {
        return false;
    }

    @Override
    public DeviceCategory updateCategory(Long id, DeviceCategory category) {
        return null;
    }

    @Override
    public List<DeviceCategory> getCategoryList() {
        List<DeviceCategoryEntity> deviceCategoryEntities = categoryRepo.findAll();

        List<DeviceCategory> deviceCategories = deviceCategoryEntities.stream()
                .map(category -> new DeviceCategory(
                        category.getId(), category.getCategoryName()
                ))
                .collect(Collectors.toList());

        return deviceCategories;
    }
}
