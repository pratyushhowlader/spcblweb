package spcbl.org.bd.osp.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "tbl_wpr")
public class WeaklyPlanning {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "machine_name")
    private String machineName;

    @Column(name = "start_date")
    private Date startDate;

    @Column(name = "end_date")
    private Date endDate;

    @Column(name = "total_printing")
    private Integer totalPrinting;

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMachineName() {
        return this.machineName;
    }

    public void setMachineName(String machineName) {
        this.machineName = machineName;
    }

    public Date getStartDate() {
        return this.startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return this.endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Integer getTotalPrinting() {
        return this.totalPrinting;
    }

    public void setTotalPrinting(Integer totalPrinting) {
        this.totalPrinting = totalPrinting;
    }
}
