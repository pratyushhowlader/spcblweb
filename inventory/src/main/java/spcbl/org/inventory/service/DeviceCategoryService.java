/*
 * Copyright (c) 10/12/22, 1:32 PM.
 * Author: Prasun Kanti Howlader
 * All rights reserved
 */

package spcbl.org.inventory.service;

import spcbl.org.inventory.model.DeviceCategory;

import java.util.List;

public interface DeviceCategoryService {
    DeviceCategory addNewCategory(DeviceCategory category);
    boolean deleteCategory(Long id);
    DeviceCategory updateCategory(Long id, DeviceCategory category);
    List<DeviceCategory> getCategoryList();

}
