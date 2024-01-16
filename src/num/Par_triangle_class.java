package num;


public class Par_triangle_class {

	private int s1;
	
	private int s2;
		
	private int s3;
	
	
	/*
	 * Continue with class, 
	 * write 2 constructors 
	 * one with default values
	 *  second one with arguments
	 *  do gets and sets
	 *  do operations, calArea,calPerimiter
	 *  write Str function
	 *  create main and test your class with 2 objects
	 *  (test with 3,4,5)
	 *  */
	
	Par_triangle_class( ) {
		s1=1;
		s2=2;
		s3=5;
	}
	Par_triangle_class(int a,int b,int c){
		if (a+b>c && a+c>b && b+c>a) {
			s1=a;
			s2=b;
			s3=c;
		}
		else {
			System.out.println("invalid triangle");
		}
	}
	//gets
	public int getSide1( ) {
		return s1;
	}
	public int getSide2( ) {
		return s2;
	}
	public int getSide3( ) {
		return s3;
	}
	//sets
	public void setSide1( int side1 ) {
		s1 = side1;
	}
	public void setSide2( int side2 ) {
		s2 = side2;
	}
	public void setSide3( int side3 ) {
		s3 = side3;
	}
	//methods/opperations
	public double calcArea( ) {
		double semi  = calcPerimeter()/2.0;
		double area = Math.sqrt(semi*(semi-s1)*(semi-s2)*(semi-s3));
		return area;
	}
	
	public double calcPerimeter( ) {
		//double peri = 2.0 * ( length +  width );
		return 1.0*( s1 + s2 + s3 );
	}
	
	public String toString() { // __str__( self ) 
		
		String rString = "The sides of your triangle are:\n";
		rString += " Side A : " + s1 + "\n";
		rString += " Side B: " + s2 + "\n";
		rString += " Hypotonuse: " + s3 + "\n";
		
		return rString;
	}
}
