package Entity;

public class CreditCard {
	private Account account;
	private int num;
	private int code;
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
	public CreditCard(Account account, int num, int code) {
		
		this.account = account;
		this.num = num;
		this.code = code;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	

}
