package market.entity;

import java.io.Serializable;

public class NewsUser implements Serializable {

    private static final long seriaVersionUID=7078561370483132024L;
    //    用户id
    private int id;
    private String name;
    private String password;

    @Override
    public String toString() {
        return "NewsUser{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public NewsUser() {
    }

    public NewsUser(int id) {
        this.id = id;
    }

    public NewsUser(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public NewsUser(int id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }

    public static long getSeriaVersionUID() {
        return seriaVersionUID;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
