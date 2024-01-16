package num;

import java.util.ArrayList;

public class YosefGuestMain extends GuestFactory {

	YosefGuestMain(String N) {
		super(N);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {         
    	ArrayList<Guest> guestList = new ArrayList<Guest>();              
         // Register new guests                            
       guestList.add(new Guest("Mary"));         
       guestList.add(new DutchGuestYosef("Jaap"));         
       guestList.add(new FrenchGuestYosef("Heidi"));         
       guestList.add(new IsraeliGuestYosef("Jean Claude"));        
     // Bed time sequence         
   System.out.println("Time to turn out the lights.");         
    for (int i = 0; i < guestList.size(); i++) 
    {             
            Guest visitor = guestList.get(i);             
         System.out.println("  " + visitor.greetNight());         
   }        
   // Breakfast sequence         
   System.out.println("Time for breakfast!");         
   for (Guest visitor : guestList) 
   {             
           System.out.println("  " + visitor.greetMorning());         
  }  
} 

}
