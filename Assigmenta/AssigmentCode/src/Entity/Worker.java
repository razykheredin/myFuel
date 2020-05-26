package Entity;
enum Job {
	stationmanager, networkadmin,marketingmanager
};

public class Worker extends User{
private int Workernum;
private Job job;//8888

	public Worker(String username, String password, status stat, String name, String surname, String Email,Job job,int workernum) {
		super(username, password, stat, name, surname, Email);
		// TODO Auto-generated constructor stub
		this.Workernum=workernum;
		this.job=job;
	}

	public int getWorkernum() {
		return Workernum;
	}

	public Job getJob() {
		return job;
	}

}
