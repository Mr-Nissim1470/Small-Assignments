package num;

public class DutchGuestYosef extends Guest {
	
	DutchGuestYosef(String name){
		super(name); 
	}
	
	public String greetNight() {
		return("Guetemorgen "+super.getName());
		}
	
	public String greetMorning() {
		return("Slaap lekker "+super.getName());
	}
	
}
