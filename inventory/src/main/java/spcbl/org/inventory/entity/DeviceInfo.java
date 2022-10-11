/*
 * Copyright (c) 10/11/22, 10:25 AM.
 * Author: Prasun Kanti Howlader
 * All rights reserved
 */

package spcbl.org.inventory.entity;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class DeviceInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String deviceName;
    @OneToOne
    @JoinColumn(name = "category_id",referencedColumnName = "id")
    private DeviceCategory category;

    private String serialNo;
    private String description;
    private boolean status;
    private LocalDate receiveDate;
    private String comments;
    /*private DeviceUser deviceUser;*/

    public DeviceInfo() {
    }

    public DeviceInfo(Long id, String deviceName, DeviceCategory category, String serialNo, String description, boolean status, LocalDate receiveDate, String comments) {
        this.id = id;
        this.deviceName = deviceName;
        this.category = category;
        this.serialNo = serialNo;
        this.description = description;
        this.status = status;
        this.receiveDate = receiveDate;
        this.comments = comments;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public DeviceCategory getCategory() {
        return category;
    }

    public void setCategory(DeviceCategory category) {
        this.category = category;
    }

    public String getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(String serialNo) {
        this.serialNo = serialNo;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public LocalDate getReceiveDate() {
        return receiveDate;
    }

    public void setReceiveDate(LocalDate receiveDate) {
        this.receiveDate = receiveDate;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    @Override
    public String toString() {
        return "DeviceInfo{" +
                "id=" + id +
                ", deviceName='" + deviceName + '\'' +
                ", category=" + category +
                ", serialNo='" + serialNo + '\'' +
                ", description='" + description + '\'' +
                ", status=" + status +
                ", receiveDate=" + receiveDate +
                ", comments='" + comments + '\'' +
                '}';
    }
}
