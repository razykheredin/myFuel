package Entity;

public class NetWorkAdmin extends Worker {
	private int Rate;
public NetWorkAdmin(String username, String password, status stat, String name, String surname, String Email,
			Job job, int workernum,int rate) {
		super(username, password, stat, name, surname, Email, job, workernum);
		this.Rate=rate;
		// TODO Auto-generated constructor stub
	}


}
