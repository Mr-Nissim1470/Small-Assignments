package num;
import java.util.Scanner;
public class JavaSpeedLimitProgram___Assignment_3p1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//setting variables
System.out.println("Welcom to Tickit Print(Java Edition)");

Scanner inp = new Scanner(System.in);

System.out.println("Give the speed of the pulled over vehichle: \n");

int SpeedYosef = inp.nextInt();

System.out.println("What is the speed limit on the area culprit was pulled over?: \n");

int SpeedLimitYosef = inp.nextInt();

System.out.println("Was the culprit pulled over in a Nutral, Construction, or School zone?");

String ZoneYosef = inp.next();

// Parameter chart
double Fine = 0;
String Phrase = null;
String Stat = null;
String CSZ = null;

// the null was a correction done by the software

int Protocal = 0;

int Dif = SpeedYosef - SpeedLimitYosef;
//Protocol 1 
if (Dif < 5) 
	Protocal = 1; 

//Protocol 2
else if (Dif < 15) 
	Protocal = 2;
		
//Protocol 3
else if (Dif < 25) 
	Protocal = 3;
	
//Protocol 4
else if (Dif < 30) 
	Protocal = 4;
	
//Protocol 5
else if (Dif >= 30) 
	Protocal = 5;
switch (ZoneYosef) {

// zone categories

case("School"):
case("school"):
case("S"):
case("s"):
	CSZ = "School Zone";
	Fine = Fine*2;
break;
case("Nutral"):
case("nutral"):
case("n"):
case("N"):
	CSZ = "Nutral Zone";
	Fine = Fine;
break;
case("construction"):
case("Construction"):
case("C"):
case("c"):
	CSZ = "Construction Zone";
	Fine = Fine*2;
	break;
default:
	CSZ = "Can't be determined";
	Fine = Fine;

}

switch(Protocal) {
case(1):
	Fine = 89;
	Stat = ("$"+Fine);
	Phrase = "Slow Down!";
	break;
case(2):
	Fine = 119;
	Stat = ("$"+Fine);
	Phrase = "Drive with caution!";
	break;
case(3):
	Fine = 159;
	Phrase = "You are speeding!";
	Stat = ("$"+Fine);
	break;
case(4):
	Fine = 229;
	Stat = ("$"+Fine);
	Phrase = "You're in the danger zone!";
	break;
case(5):
	Stat = "To be decided in court";
	Phrase = "See you in court!!";
	break;
}


//Final Print Statements
System.out.println("---Your Ticket--- \n"
		+ "Your Speed: " + SpeedYosef+"\n"
				+ "Speed limit: "+SpeedLimitYosef+"\n"
						+ "Zone detained: "+ CSZ + "\n"
								+ "Your fine is: "+Stat +"\n"
										+ ""+Phrase);

	}

}
