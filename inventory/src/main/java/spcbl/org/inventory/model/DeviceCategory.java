/*
 * Copyright (c) 10/12/22, 1:26 PM.
 * Author: Prasun Kanti Howlader
 * All rights reserved
 */

package spcbl.org.inventory.model;

public class DeviceCategory {
    private Long id;
    private String categoryName;

    public DeviceCategory(Long id, String categoryName) {
        this.id = id;
        this.categoryName = categoryName;
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

    @Override
    public String toString() {
        return "DeviceCategory{" +
                "id=" + id +
                ", categoryName='" + categoryName + '\'' +
                '}';
    }
}
