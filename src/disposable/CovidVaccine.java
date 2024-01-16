package disposable;

public abstract class CovidVaccine {
	
	protected String name;
	protected String company;
	protected String type;
	protected int numShots;
	protected int daysApart;
	
	CovidVaccine() {
		name = "Generic";
		company = "Unknown";
		type = "";
		numShots = 1;
		daysApart = 0;
	}
	
	CovidVaccine( String n, String c, String t, int nos ) {
		name = n;
		company = c;
		type = t;
		numShots = nos;
		daysApart = 0;
	}
	
	public int getNumShots() {
		return numShots;
	}
	
	public void setNumShots(int numShots) {
		this.numShots = numShots;
	}
	
	public abstract double priceOfVaccination(  );
	
	public String toString() {
		String covStr = "";
		covStr += name + " Covid Vaccine developed by " + company + "\n" +
				" Inc. uses a vaccine of type " + type + " needs " + numShots + " shot(s) ";
		String daysApartStr = numShots == 1? ".": daysApart + " days Apart.";
		
		return covStr + daysApartStr;
	}	
	
}


