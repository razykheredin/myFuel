package Entity;

public class Account {
	private String Username;
	private String Password;
	private String name;
	private String FamilyName;
	private int IdNum;
	private String Email;
	private CreditCard CreditCard;

	public Account(String username, String password, String name, String familyName, int idNum, String email,
			Entity.CreditCard creditCard) {
		
		Username = username;
		Password = password;
		this.name = name;
		FamilyName = familyName;
		IdNum = idNum;
		Email = email;
		CreditCard = creditCard;
	}
	public String getFamilyName() {
		return FamilyName;
	}
	public String getUsername() {
		return Username;
	}
	public String getPassword() {
		return Password;
	}
	public String getName() {
		return name;
	}

	public int getId() {
		return IdNum;
	}
	public String getEmail() {
		return Email;
	}
	public CreditCard getCreditCard() {
		return CreditCard;
	}
}
