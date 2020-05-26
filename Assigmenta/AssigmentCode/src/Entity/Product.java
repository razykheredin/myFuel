package Entity;



 enum product{
	gas,disel,cooterFuel,homeHeatingFuel
};
public class Product {
private product product;
public product getProduct() {
	return product;
}
public void setProduct(product product) {
	this.product = product;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public int getRate() {
	return rate.getRatePrice();
			
}
public void setRate(Rates rate) {
	this.rate = rate;
}
private int price;
private Rates rate;
public Product(product product, int price, Rates rate) {
	
	this.product = product;
	this.price = price;
	this.rate = rate;
}


}
