package Entity;

import java.util.Date;
enum OrderType{
	UregntFueling,Letters600TO800,LettersMoreThan800
};
public class HomeHeatingFuel extends Product{
private Date supplyTiming;
private int discount;
private int orderType;
public HomeHeatingFuel(productType product, int price, Rates rate,int discount,int ordertype,Date supplyTime) {
		super(product, price, rate);
		this.discount=discount;
		this.orderType=ordertype;
		this.supplyTiming=supplyTime;
		// TODO Auto-generated constructor stub
	}
public int getDiscount() {
	return discount;
}
public void setDiscount(int discount) {
	this.discount = discount;
}
public int getOrderType() {
	return orderType;
}
public void setOrderType(int orderType) {
	this.orderType = orderType;
}
public Date getSupplyTiming() {
	return supplyTiming;
}

}
