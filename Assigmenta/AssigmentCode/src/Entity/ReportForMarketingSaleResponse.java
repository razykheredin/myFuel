package Entity;

import java.util.ArrayList;

public class ReportForMarketingSaleResponse {
private int numOfCustomersWhoBought;
private int totalPurchases;
private ArrayList<Integer> customerAmountInRate=new ArrayList<Integer>();
private int index=0;
public int getNumOfCustomersWhoBought() {
	return numOfCustomersWhoBought;
}
public void setNumOfCustomersWhoBought(int numOfCustomersWhoBought) {
	this.numOfCustomersWhoBought = numOfCustomersWhoBought;
}
public int getTotalPurchases() {
	return totalPurchases;
}
public void setTotalPurchases(int totalPurchases) {
	this.totalPurchases = totalPurchases;
}
public void addAmount(int amount)
{
	
	customerAmountInRate.add(amount);
}
public int GetAmount(int i)
{
	
	return customerAmountInRate.get(i);
}
public void removeAmount (int i)
{
	customerAmountInRate.remove(i);
}

}
