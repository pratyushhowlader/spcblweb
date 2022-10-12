/*
 * Copyright (c) 10/11/22, 10:30 AM.
 * Author: Prasun Kanti Howlader
 * All rights reserved
 */

package spcbl.org.inventory.entity;

import javax.persistence.*;

@Entity
@Table(name = "device_category")
public class DeviceCategoryEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "category_name")
    private String categoryName;

    @OneToOne(mappedBy = "category")
    private DeviceInfo deviceInfo;

    public DeviceCategoryEntity(Long id, String categoryName, DeviceInfo deviceInfo) {
        this.id = id;
        this.categoryName = categoryName;
        this.deviceInfo = deviceInfo;
    }

    public DeviceCategoryEntity(Long id, String categoryName) {
        this.id = id;
        this.categoryName = categoryName;
    }

    public DeviceCategoryEntity() {
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
