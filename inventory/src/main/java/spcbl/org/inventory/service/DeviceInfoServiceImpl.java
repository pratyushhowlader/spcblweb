/*
 * Copyright (c) 10/11/22, 3:35 PM.
 * Author: Prasun Kanti Howlader
 * All rights reserved
 */

package spcbl.org.inventory.service;

import org.springframework.stereotype.Service;
import spcbl.org.inventory.entity.DeviceInfo;
import spcbl.org.inventory.repository.DeviceInfoRepo;

import java.util.List;

@Service
public class DeviceInfoServiceImpl implements DeviceInfoService {
    private final DeviceInfoRepo deviceInfoRepo;

    public DeviceInfoServiceImpl(DeviceInfoRepo deviceInfoRepo) {
        this.deviceInfoRepo = deviceInfoRepo;
    }

    @Override
    public List<DeviceInfo> getAllDevice() {
        return deviceInfoRepo.findAll();
    }
}
