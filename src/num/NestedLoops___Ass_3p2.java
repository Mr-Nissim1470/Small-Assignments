package num;
import java.util.Scanner;
public class NestedLoops___Ass_3p2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int L = 0;
		String Spek = "*";
		String EP  ="!";
		System.out.println("input how many lines to ");
		Scanner UwU = new Scanner(System.in);
		int Line = UwU.nextInt();
		for(int n = L;n<Line;n++) {
			L++;
			String m = EP;
			for(int F = L;F<Line-1;F++) {	
			 m = m + EP;
			 
				 
			}
			if(L!=Line)
				System.out.println(Spek+m);
			else
				System.out.println(Spek);
				
			 
			
			Spek = Spek+"*";
		}
		
	}

}
