package disposable;

public class Yosef extends CovidVaccine {

	 String name; 
	 String company; 
	 String  type; 
	 int numShots; 
	 String ageType;
	double price;
	
	Yosef(){
		 name = "Yosef";
		  company = "Nahon";
		   type = "carrier";
		  numShots = 1;
		  ageType = "Adult";
	}
	Yosef(String P){
		 name = "Yosef";
		  company = "Nahon";
		   type = "carrier";
		  numShots = 1;
		  ageType = P;
		  if (P!="Senior"|P!="Teen") {
			  P = "Adult";
		  }
	}
	public double priceOfVaccination() {
		if (ageType == "Teen") {
			price = 40 / numShots;
		}
		if (ageType == "Adult") {
			price = 20 / numShots;
		}
		if (ageType == "Senior") {
			price = 75 / numShots;
		} 
		return price;
		}
	
	public String toString() {
		String END = "";
		END+= "Your fee as a "+this.ageType+" will cost you $"+priceOfVaccination();
		return END;
	} 


}
