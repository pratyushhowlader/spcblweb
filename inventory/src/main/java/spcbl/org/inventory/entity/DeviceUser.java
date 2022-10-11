/*
 * Copyright (c) 10/11/22, 10:34 AM.
 * Author: Prasun Kanti Howlader
 * All rights reserved
 */

package spcbl.org.inventory.entity;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class DeviceUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDate usagesDate;
    private String Section;

    /*@OneToOne(mappedBy = "")*//*
    private DeviceInfo deviceInfo;*/

}
