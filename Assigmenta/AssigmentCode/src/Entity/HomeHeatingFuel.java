package Entity;

import java.util.Date;

public class HomeHeatingFuel extends Product{
private Date supplyTiming;
private int discount;
private int orderType;
public HomeHeatingFuel(product product, int price, Rates rate,int discount,int ordertype,Date supplyTime) {
		super(product, price, rate);
		this.discount=discount;
		this.orderType=ordertype;
		this.supplyTiming=supplyTime;
		// TODO Auto-generated constructor stub
	}

}
