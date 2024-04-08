package app.entities;

public class Orderline {

    private int orderlineId;
    private int amount;
    private int price;
    private int toppingId;
    private int bottomId;
    private int orderId;

    public Orderline(int orderlineId, int amount, int price, int toppingId, int bottomId, int orderId) {
        this.orderlineId = orderlineId;
        this.amount = amount;
        this.price = price;
        this.toppingId = toppingId;
        this.bottomId = bottomId;
        this.orderId = orderId;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getToppingId() {
        return toppingId;
    }

    public void setToppingId(int toppingId) {
        this.toppingId = toppingId;
    }

    public int getBottomId() {
        return bottomId;
    }

    public void setBottomId(int bottomId) {
        this.bottomId = bottomId;
    }

    public int getOrderlineId() {
        return orderlineId;
    }

    public void setOrderlineId(int orderLineId) {
        this.orderlineId = orderlineId;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    @Override
    public String toString() {
        return "OrderLine{" +
                "orderLineId=" + orderlineId +
                ", amount=" + amount +
                ", price=" + price +
                ", toppingId=" + toppingId +
                ", bottomId=" + bottomId +
                ", orderId=" + orderId +
                '}';
    }
}