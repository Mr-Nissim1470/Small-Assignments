package num;

public class FrenchGuestYosef extends Guest {

	FrenchGuestYosef(String Name) {
		super(Name);
	}
	
	public String greetNight() {
		return("Bonne nuit "+super.getName());
		}
	
	public String greetMorning() {
		return("Bonjour "+super.getName());
	}

}
