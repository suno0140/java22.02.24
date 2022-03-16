package chap06.book.exercis.p20;

public class Account {
	private String ano; //계좌번호
	private String owner; //계좌주
	private int balance; //금액
	
	
	//소스 생성자로 자동완성가능
	public Account(String ano, String owner, int balance) {
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
	}

	
	//소스 get,set으로 자동완성가능
	public String getAno() {return ano;}
	public void setAno(String ano) {this.ano = ano;}
	public String getOwner() {return owner;	}
	public void setOwner(String owner) {this.owner = owner;}
	public int getBalance() {return balance;}
	public void setBalance(int balance) {this.balance = balance;}
	
	
}