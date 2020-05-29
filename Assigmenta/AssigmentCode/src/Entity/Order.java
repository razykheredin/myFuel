package Entity;
enum OrderStatus 
{ 
	Available, UnAvailable
};
public class Order {
private String OrderType;
private int amount;
private String orderName;
private int orderCost;
private OrderStatus OrderStatus;
public OrderStatus getOrderStatus() {
	return OrderStatus;
}
public void setOrderStatus(OrderStatus orderStatus) {
	OrderStatus = orderStatus;
}
public int getAmount() {
	return amount;
}
public String getOrderType() {
	return OrderType;
}
public void setOrderType(String orderType) {
	OrderType = orderType;
}
public void setAmount(int amount) {
	this.amount = amount;
}
public String getOrderName() {
	return orderName;
}
public void setOrderName(String orderName) {
	this.orderName = orderName;
}
public int getOrderCost() {
	return orderCost;
} 

}
