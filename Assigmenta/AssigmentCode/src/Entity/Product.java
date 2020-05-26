package Entity;



 enum productType{
	gas,disel,cooterFuel,homeHeatingFuel
};
public class Product {
private productType product;
public productType getProduct() {
	return product;
}
public void setProduct(productType product) {
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
public Product(productType product, int price, Rates rate) {
	
	this.product = product;
	this.price = price;
	this.rate = rate;
}


}
