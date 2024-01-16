package disposable;

public class Moderna extends CovidVaccine {

	 String name;
	
	 String company;
	
	 String type;
	
	 int numShots;
	
	 int daysApart;
	 
	 double dosage;

	 double price;
	
	
	Moderna(){
		name = "Moderna";
		company = "Moderna,NIAID";
		type = "mRNA";
		numShots = 2; 
		daysApart = 28;
		dosage = 0.5;
	}
	
	Moderna(double D){
		name = "Moderna";
		company = "Moderna,NIAID";
		type = "mRNA";
		numShots = 2; 
		daysApart = 28;
		dosage = D;
	}
	public double priceOfVaccination() {
		if ( dosage > 0.5) {
			price = 100 * dosage * numShots;}
		if ( dosage < 0.5) {
			price = 50 * dosage * numShots;}
		if ( dosage == 0.5) {
			price = 75 * dosage * numShots;}
		
		return price;
	}
	
	public String toString() {
		String FIN = "";
		FIN+= "Your fee for "+this.numShots+" shots of the "+this.name+" vaccine  at dosage "+this.dosage+" will cost "+priceOfVaccination()+" please return in "+this.daysApart+" days for next dosage";
		return FIN;
	}
}
