/*
 * Copyright (c) 10/11/22, 3:32 PM.
 * Author: Prasun Kanti Howlader
 * All rights reserved
 */

package spcbl.org.inventory.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import spcbl.org.inventory.entity.DeviceCategory;

public interface DeviceCategoryRepo extends JpaRepository<DeviceCategory,Long> {
}
