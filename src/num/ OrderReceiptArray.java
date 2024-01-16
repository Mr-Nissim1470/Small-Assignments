package num;

public class YosefOrderReceiptArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double dTotalPrice = 0.0;         
		int iTotalWeight = 0;  
		
		// Put the 4 items being ordered in item1 through item 4         
		Item item1 = new Item(24.99, 14, "Wireless Mouse");         
		Item item2 = new Item(22.49, 27, "USB Keyboard");         
		Item item3 = new Item(24.99, 12, "HDMI Cable");         
		Item item4 = new Item(7.99, 7, "Reading Glasses");         
		item4.setQuantity(2);   
		
		
		Item [] Items = {item1,item2,item3,item4};
		// Show the details of the order using show()         
		System.out.println("Here are your shopping cart contents."); 
		for (int I=0;I<Items.length;I++) {
			System.out.println(Items[I]);
			dTotalPrice += Items[I].getOrderPrice();
			iTotalWeight += Items[I].getOrderWeightInOunces();
		}       
		// Here we show the order details        
		System.out.println("The price of your order is $" + dTotalPrice);         
		System.out.println("The shipping weight is " + iTotalWeight / 16  + " pounds " + iTotalWeight %                          
		                                     16 + " ounces");     
	}

}
