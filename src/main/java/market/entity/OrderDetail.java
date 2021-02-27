package market.entity;

public class OrderDetail {
    private int id;
    private int orderId;
    private int productId;
    private double cost;

    @Override
    public String toString() {
        return "OrderDetail{" +
                "id=" + id +
                ", orderId=" + orderId +
                ", productId=" + productId +
                ", cost=" + cost +
                '}';
    }

    public OrderDetail() {
    }

    public OrderDetail(int id, int orderId, int productId, double cost) {
        this.id = id;
        this.orderId = orderId;
        this.productId = productId;
        this.cost = cost;
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

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
}
