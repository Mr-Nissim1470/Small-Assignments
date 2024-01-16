package disposable;

public class empty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Mississippi";
		s.replace("ss", "zz");
		System.out.println(s);
		
		String d = "321";

		String e = "42";
        
        System.out.println( e.substring(1) + d.substring(1) );
        
        Moderna me = new Moderna();
        
        Yosef a = new Yosef(); 
        
        System.out.println(a);
        
	}


public static int func(int z) {
	int sum = 0;
	if (z==0) {
		sum += 3;
	}
	
		z = z - 1 ;
		sum = func( z )+ 10*z;
		
	return sum;
	}
	

	
	
}
