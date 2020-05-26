package Entity;

public class Customer extends User   {
	private int CarId;
	private int id;
	private int paymentMethod;
	
	public Customer(String username, String password, status stat, String name, String surname, String Email,int id,int carid,int paymentMethod) {
		super(username, password, stat, name, surname, Email);
		// TODO Auto-generated constructor stub
		this.id=id;
		this.CarId=carid;
		this.paymentMethod=paymentMethod;
	}

	public int getCarId() {
		return CarId;
	}

	public int getId() {
		return id;
	}

	public int getPaymentMethod() {
		return paymentMethod;
	}


	
	
	

}
