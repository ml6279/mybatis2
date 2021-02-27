package market.entity;

import java.util.Date;
import java.util.List;

public class EasybuyOrder {
    private int id;
    private String loginName;
    private Date createTime;
    private double cost;
    private String serialNumber;
    private List<OrderDetail> detail;   //装商品明细     一对多
    private OrderDesc orderDesc;        //订单描述明细    一对一的关系


    @Override
    public String toString() {
        return "EasybuyOrder{" +
                "id=" + id +
                ", loginName='" + loginName + '\'' +
                ", createTime=" + createTime +
                ", cost=" + cost +
                ", serialNumber='" + serialNumber + '\'' +
                ", detail=" + detail +
                ", orderDesc=" + orderDesc +
                '}';
    }

    public EasybuyOrder() {
    }

    public EasybuyOrder(int id, String loginName, Date createTime, double cost, String serialNumber, List<OrderDetail> detail, OrderDesc orderDesc) {
        this.id = id;
        this.loginName = loginName;
        this.createTime = createTime;
        this.cost = cost;
        this.serialNumber = serialNumber;
        this.detail = detail;
        this.orderDesc = orderDesc;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public List<OrderDetail> getDetail() {
        return detail;
    }

    public void setDetail(List<OrderDetail> detail) {
        this.detail = detail;
    }

    public OrderDesc getOrderDesc() {
        return orderDesc;
    }

    public void setOrderDesc(OrderDesc orderDesc) {
        this.orderDesc = orderDesc;
    }
}
