package market.entity;

import java.util.ArrayList;
import java.util.List;

public class Teacher {
    private int tid;
    private String tname;
    private String subject;
    private List<Student> slist = new ArrayList<>();

    public List<Student> getSlist() {
        return slist;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "tid=" + tid +
                ", tname='" + tname + '\'' +
                ", subject='" + subject + '\'' +
                ", slist=" + slist +
                '}';
    }

    public Teacher() {
    }

    public Teacher(int tid, String tname, String subject, List<Student> slist) {
        this.tid = tid;
        this.tname = tname;
        this.subject = subject;
        this.slist = slist;
    }

    public int getTid() {
        return tid;
    }

    public void setTid(int tid) {
        this.tid = tid;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setSlist(List<Student> slist) {
        this.slist = slist;
    }
}
