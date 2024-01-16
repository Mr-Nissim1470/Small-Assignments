package num;

public class GuestFactory extends Guest{

	GuestFactory(String N) {
		super(N);
		// TODO Auto-generated constructor stub
	}

	public static Guest getGuestInstance(String Name, String Language ){
		
		//Guest NewGuest;
		
		switch(Language) {
		
		case("Dutch"):
		case("Duch"):
		case("D"):
		case("Belgium"):
		case("Belgian"):
		case("Belgean"):
		case("Belgen"):
		case("B"):
			Language = "Dutch";
		//return new DutchGuestYosef(Name);
		
		break;
		case("French"):
		case("France"):
		case("france"):
		case("french"):
		case("F"):
		case("f"):
		case("Paris"):
		case("paris"):
		case("P"):
		case("p"):
		case("Pares"):
		case("pares"):
			Language = "French";
		//return  new FrenchGuestYosef(Name);
		
		break;
		case("Israeli"):
		case("Israel"):
		case("israeli"):
		case("israel"):
		case("I"):
		case("i"):
		case("Hebrew"):
		case("hebrew"):
		case("H"):
		case("h"):
			Language = "Hebrew";
		break;
		//return new IsraeliGuestYosef(Name);
		default:
			System.out.println("Unidentifyable Language for "+Name+": \n The system will default to English");
			Language = "Other";
		}
		
		if (Language == "Dutch") {
			return( new DutchGuestYosef(Name));
		}
		else if(Language == "French") {
			return( new FrenchGuestYosef(Name));
		}
		else if(Language == "Hebrew") {
			return( new IsraeliGuestYosef(Name));
		}
		else {
			return( new Guest(Name));
		}
	
	}
	
	
}
