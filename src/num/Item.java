package num;

public class Item {

	private double price;
	private int weightInOunces;
	private String description;
	private int Quantity;
	
	Item(){
		this.price = 0;
		this.weightInOunces = 0;
		this.description = "Sample Item";
		this.Quantity = 1;
	}
	Item(double P,int W,String D){
		this.price = P;
		this.weightInOunces = W;
		this.description = D;
		this.Quantity = 1;
	}
	public double getOrderPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getOrderWeightInOunces() {
		return weightInOunces;
	}
	public void setOrderWeightInOunces(int weightInOunces) {
		this.weightInOunces = weightInOunces;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getQuatity() {
		return Quantity;
	}
	public void setQuantity(int quantity) {
		this.Quantity = quantity;
	}
	
	public String toString() {
		String Stat = "";
		Stat+=	""+price+" each for "+Quantity+" "+description;	
		
		return Stat;
	}
	
	
}
