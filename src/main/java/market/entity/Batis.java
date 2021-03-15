package market.entity;

import java.util.Date;


public class Batis {
    private int id;
    private String name;
    private Date date;
    private String desc;

    @Override
    public String toString() {
        return "Batis{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", date=" + date +
                ", desc='" + desc + '\'' +
                '}';
    }

    public Batis() {
    }

    public Batis(int id, String name, Date date, String desc) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.desc = desc;
    }

    public Batis(String name, Date date, String desc) {
        this.name = name;
        this.date = date;
        this.desc = desc;
    }

    public Batis(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
