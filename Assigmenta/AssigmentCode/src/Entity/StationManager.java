package Entity;

public class StationManager extends Worker {
	private int theresholdlevel;

public StationManager(String username, String password, status stat, String name, String surname, String Email,
			Job job, int workernum,int theresholdlevel ) {
		super(username, password, stat, name, surname, Email, job, workernum);
		this.theresholdlevel=theresholdlevel;
		// TODO Auto-generated constructor stub
	}

public int getTheresholdlevel() {
	return theresholdlevel;
}

public void setTheresholdlevel(int theresholdlevel) {
	this.theresholdlevel = theresholdlevel;
}


}
