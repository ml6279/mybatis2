package market.entity;

public class OrderDesc {
    private int id;
    private int orderId;
    private String describle;

    @Override
    public String toString() {
        return "OrderDesc{" +
                "id=" + id +
                ", orderId=" + orderId +
                ", describle='" + describle + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getDescrible() {
        return describle;
    }

    public void setDescrible(String describle) {
        this.describle = describle;
    }
}
