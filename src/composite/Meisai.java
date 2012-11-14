package composite;

public class Meisai {
	
	private int meisaiBango;
	private String productName;
	private int price;
	
	public Meisai(int meisaiBango, String productName, int price){
		this.meisaiBango = meisaiBango;
		this.productName = productName;
		this.price = price;
	}
	public int getMeisaiBango(){
		return meisaiBango;
	}
	public String getProductName(){
		return productName;
	}
	public int getPrice(){
		return price;
	}

}
