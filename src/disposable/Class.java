package disposable;

public abstract class Class {
	
	protected String type;
	protected double length;
	protected double width;
	protected double height;
	protected int NumOfDoors;
	protected int NumOfWindows;
	
	Class(){
		type="Bland Room";
		length = 10;
		width = 10;
		height = 10;
		this.NumOfDoors = 1;
		this.NumOfWindows = 0;
	}
	Class(String Name){
		type=Name;
		length = 10;
		width = 10;
		height = 10;
		this.NumOfDoors = 1;
		this.NumOfWindows = 0;
	}
	Class(String T, double L, double w,double h,int nod,int now){
		type= T ;
		length = L;
		width = w;
		height = h;
		this.NumOfDoors = nod;
		this.NumOfWindows = now;
	}
	
	public double calWallArea() {
		double larea = length*height;
		double warea = width*height;
		double wallarea = 2*larea*warea;
		
		return wallarea;
	}
	public double calfloorarea() {
		return length*width;
	}
	
	class Kitchen extends Class{
		private int NumOfApliances;
		private double AreaOfApliences;
		
		Kitchen(){
			 super("Kitchen");
		}
		
		public double calfloorarea() {
			return (super.calfloorarea()-(this.NumOfApliances*this.AreaOfApliences));
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
public void paintroom() {
	System.out.println("painting kitchen");
}
}
