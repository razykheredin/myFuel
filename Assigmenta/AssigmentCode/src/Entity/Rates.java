package Entity;

public class Rates {
private int rateType;
private int ratePrice;
public int getRateType() {
	return rateType;
}
public void setRateType(int rateType) {
	this.rateType = rateType;
}
public int getRatePrice() {
	return ratePrice;
}
public void setRatePrice(int ratePrice) {
	this.ratePrice = ratePrice;
}
public Rates(int rateType, int ratePrice) {
	
	this.rateType = rateType;
	this.ratePrice = ratePrice;
}

}
