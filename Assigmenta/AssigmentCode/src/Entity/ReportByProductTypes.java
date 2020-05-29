package Entity;

import java.util.ArrayList;

public class ReportByProductTypes {
private ArrayList<Product> productsArr= new ArrayList<Product>();
public void removeProduct(Product product) {
	
	productsArr.remove(productsArr.indexOf(product));	
	
}
public void addProduct(Product product)
{
	productsArr.add(product);
}

}
