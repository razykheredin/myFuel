package Entity;

enum status {
	Customer, Worker
};

public class User {
	private String username;
	private String name ;
	private String surname ;
	private status s;
private String email;
	private String password;

	public User(String username, String password, status stat,String name,String surname,String Email) {
		this.surname=surname;
		this.email=Email;
		this.name=name;
		this.s = stat;
		this.username = username;
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public status getS() {
		return s;
	}

	public String getPassword() {
		return password;
	}
	public String getSurName() {
		return surname;
	}
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
