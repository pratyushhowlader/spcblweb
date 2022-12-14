package spcbl.org.bd.osp.model;

import javax.persistence.*;
import java.math.BigDecimal;


@Entity
@Table(name = "printingstatus")
public class DwReport {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private String id;

    @Column(name = "mc_name")
    private String mcName;

    @Column(name = "item_name")
    private String itemName;

    @Column(name = "deno")
    private String deno;

    @Column(name = "fo")
    private String fo;

    @Column(name = "date")
    private java.sql.Date date;

    @Column(name = "dprinting")
    private BigDecimal dprinting;

    @Column(name = "total_printing")
    private Integer totalPrinting;

    @Column(name="pending")
    private Integer pending;

    public Integer getPending() {
        return pending;
    }

    public void setPending(Integer pending) {
        this.pending = pending;
    }

    public String getMachineStatus() {
        return machineStatus;
    }

    public void setMachineStatus(String machineStatus) {
        this.machineStatus = machineStatus;
    }

    @Column(name = "mc_status")
    private String machineStatus;


    public String getMcName() {
        return this.mcName;
    }

    public void setMcName(String mcName) {
        this.mcName = mcName;
    }

    public String getItemName() {
        return this.itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getDeno() {
        return this.deno;
    }

    public void setDeno(String deno) {
        this.deno = deno;
    }

    public String getFo() {
        return this.fo;
    }

    public void setFo(String fo) {
        this.fo = fo;
    }

    public java.sql.Date getDate() {
        return this.date;
    }

    public void setDate(java.sql.Date date) {
        this.date = date;
    }

    public BigDecimal getDprinting() {
        return this.dprinting;
    }

    public void setDprinting(BigDecimal dprinting) {
        this.dprinting = dprinting;
    }

    public Integer getTotalPrinting() {
        return this.totalPrinting;
    }

    public void setTotalPrinting(Integer totalPrinting) {
        this.totalPrinting = totalPrinting;
    }
}
