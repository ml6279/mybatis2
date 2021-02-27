package market.entity;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private int sid;
    private String sname;
    private int id;
    private List<Teacher> slist = new ArrayList<>();


    @Override
    public String toString() {
        return "Student{" +
                "sid=" + sid +
                ", sname='" + sname + '\'' +
                ", id=" + id +
                ", slist=" + slist +
                '}';
    }


    public Student() {
    }

    public Student(int sid, String sname, int id, List<Teacher> slist) {
        this.sid = sid;
        this.sname = sname;
        this.id = id;
        this.slist = slist;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Teacher> getSlist() {
        return slist;
    }

    public void setSlist(List<Teacher> slist) {
        this.slist = slist;
    }
}
