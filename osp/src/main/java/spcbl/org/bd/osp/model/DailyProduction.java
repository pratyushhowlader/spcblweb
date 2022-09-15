package spcbl.org.bd.osp.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "tbl_dpr")
public class DailyProduction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "date")
    private Date date;

    @Column(name = "mc_name")
    private String mcName;

    @Column(name = "item_name")
    private String itemName;

    @Column(name = "deno")
    private String deno;

    @Column(name = "total_printed")
    private Integer totalPrinted;

    @Column(name = "mc_status")
    private String mcStatus;




    @Column(name = "fo")
    private String fo;
    public String getFo() {
        return fo;
    }

    public void setFo(String fo) {
        this.fo = fo;
    }
    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDate() {
        return this.date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

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

    public Integer getTotalPrinted() {
        return this.totalPrinted;
    }

    public void setTotalPrinted(Integer totalPrinted) {
        this.totalPrinted = totalPrinted;
    }

    public String getMcStatus() {
        return this.mcStatus;
    }

    public void setMcStatus(String mcStatus) {
        this.mcStatus = mcStatus;
    }

    @Override
    public String toString() {
        return "DailyProduction{" +
                "id=" + id +
                ", date=" + date +
                ", mcName='" + mcName + '\'' +
                ", itemName='" + itemName + '\'' +
                ", deno='" + deno + '\'' +
                ", totalPrinted=" + totalPrinted +
                ", mcStatus='" + mcStatus + '\'' +
                ", fo=" + fo +
                '}';
    }
}
