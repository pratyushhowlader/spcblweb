/*
 * Copyright (c) 10/11/22, 10:30 AM.
 * Author: Prasun Kanti Howlader
 * All rights reserved
 */

package spcbl.org.inventory.entity;

import javax.persistence.*;

@Entity
public class DeviceCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String categoryName;

    @OneToOne(mappedBy = "category")
    private DeviceInfo deviceInfo;

    public DeviceCategory(Long id, String categoryName, DeviceInfo deviceInfo) {
        this.id = id;
        this.categoryName = categoryName;
        this.deviceInfo = deviceInfo;
    }

    public DeviceCategory() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public DeviceInfo getDeviceInfo() {
        return deviceInfo;
    }

    public void setDeviceInfo(DeviceInfo deviceInfo) {
        this.deviceInfo = deviceInfo;
    }

    @Override
    public String toString() {
        return "DeviceCategory{" +
                "id=" + id +
                ", categoryName='" + categoryName + '\'' +
                ", deviceInfo=" + deviceInfo +
                '}';
    }
}
