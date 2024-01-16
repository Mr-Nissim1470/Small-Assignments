package num;

public class IsraeliGuestYosef extends Guest {

	IsraeliGuestYosef(String I) {
		super(I);
	}

	public String greetNight() {
		
		return("ערב טוב \n    "+super.getName());
		}
	
	public String greetMorning() {
		return("בוקר טוב \n    "+super.getName());
	}
	
}
