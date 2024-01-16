package num;

public class Triangle_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				//Creating first rectangle object R1 using the no-arg constructor
				Par_triangle_class T1 = new Par_triangle_class();
				
				System.out.println("Length of s1: " + T1.getSide1());
				System.out.println("Length of s2: " + T1.getSide2());
				System.out.println("Length of s3: " + T1.getSide3());

				
				//System.out.println(R1.length);
				T1.setSide1( 3 );
				T1.setSide2( 4 );
				T1.setSide3( 5 );
				System.out.println("Length of s1: " + T1.getSide1());
				
				System.out.println("Area of T1: " + T1.calcArea());
				System.out.println("Perimeter of T1: " + T1.calcPerimeter());
				
				//Creating second rectangle object R2 using the regular constructor
				Par_triangle_class T2 = new Par_triangle_class( 3, 4, 5 );
				
				System.out.println("Length of s1: " + T2.getSide1());
				System.out.println("Length of s2: " + T2.getSide2());
				System.out.println("Length of s3: " + T2.getSide3());
				
				System.out.println("Area of T2: " + T2.calcArea());
				System.out.println("Perimeter of T2: " + T2.calcPerimeter());
				
				
				System.out.println(T1);
				System.out.println(T2);
				
				Par_triangle_class [] TA = {T1,T2};
				
				for(int i = 0;i<TA.length;i++)
					System.out.println(TA[i].calcArea());

		
		
		
	}

}
