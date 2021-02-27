package market.entity;

import java.util.Date;

public class Batis1 {
    private int bId;
    private String bName;
    private Date bDate;
    private String bDesc;

    @Override
    public String toString() {
        return "Batis1{" +
                "bId=" + bId +
                ", bName='" + bName + '\'' +
                ", bDate=" + bDate +
                ", bDesc='" + bDesc + '\'' +
                '}';
    }

    public Batis1() {
    }

    public Batis1(int bId, String bName, Date bDate, String bDesc) {
        this.bId = bId;
        this.bName = bName;
        this.bDate = bDate;
        this.bDesc = bDesc;
    }

    public Batis1(String bName, Date bDate, String bDesc) {
        this.bName = bName;
        this.bDate = bDate;
        this.bDesc = bDesc;
    }

    public int getbId() {
        return bId;
    }

    public void setbId(int bId) {
        this.bId = bId;
    }

    public String getbName() {
        return bName;
    }

    public void setbName(String bName) {
        this.bName = bName;
    }

    public Date getbDate() {
        return bDate;
    }

    public void setbDate(Date bDate) {
        this.bDate = bDate;
    }

    public String getbDesc() {
        return bDesc;
    }

    public void setbDesc(String bDesc) {
        this.bDesc = bDesc;
    }
}
