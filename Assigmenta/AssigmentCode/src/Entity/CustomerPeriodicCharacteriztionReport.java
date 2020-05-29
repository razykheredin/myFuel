package Entity;

import java.util.ArrayList;

public class CustomerPeriodicCharacteriztionReport {
private ArrayList<Customer> ListOfCustomers=new ArrayList<Customer>();
public void addCustomer(Customer C){
	ListOfCustomers.add(C);
}
public void removeCutomer(int i)
{
	ListOfCustomers.remove(i);
}
public Customer cutomerAt(int i)
{
	return ListOfCustomers.get(i);
}
}
