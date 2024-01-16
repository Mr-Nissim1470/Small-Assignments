package num;

import java.util.ArrayList;

public class GuestMainYosef {

	public static void main(String[] args) {     
    	ArrayList<Guest> guestList = new ArrayList<Guest>();   
    	System.out.println("Registering names...");
         // Register new guests                            
       guestList.add(GuestFactory.getGuestInstance("Yosef","H"));         
       guestList.add(GuestFactory.getGuestInstance("Diana","French"));         
       guestList.add(GuestFactory.getGuestInstance("Matt","Dutch"));         
       guestList.add(GuestFactory.getGuestInstance("Ava","Spanish"));        
     // Bed time sequence         
   System.out.println("Time to turn out the lights.");         
    for (int i = 0; i < guestList.size(); i++) 
    {             
            Guest visitor = guestList.get(i);             
         System.out.println("  -" + visitor.greetNight());         
   }        
   // Breakfast sequence         
   System.out.println("Time for breakfast!");         
   for (Guest visitor : guestList) 
   {             
           System.out.println("  -" + visitor.greetMorning());         
  }  
} 

}
