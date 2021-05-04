package Entities;

public class Sale {

	int id;
	String memberUserName;
	double priceGame;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMemberUserName() {
		return memberUserName;
	}
	public void setMemberUserName(String memberUserName) {
		this.memberUserName = memberUserName;
	}
	public double getPriceGame() {
		return priceGame;
	}
	public void setPriceGame(double priceGame) {
		this.priceGame = priceGame;
	}
}
