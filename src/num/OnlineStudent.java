package num;

public class OnlineStudent extends UniversityStudentYosef {

	private int noOfOnlineClasses;
	private double VLabFee;
	
	OnlineStudent(){
		this.noOfOnlineClasses = 2;
		this.VLabFee = 0.00;
	}
	
	OnlineStudent(String FN,String LN,String ssn,int SY,String D,int DC, double CF,int OC,double VLF){
		super(FN,LN,ssn,SY,D,DC,CF);
		if (OC>=2&OC<=5) {
		this.noOfOnlineClasses = OC;
		}
		else {
			System.out.println("This number could not be determined \n The amount was auto set to 2");
			OC = 2;
		}
		this.VLabFee = VLF;
	}

	public int getNoOfOnlineClasses() {
		return noOfOnlineClasses;
	}

	public void setNoOfOnlineClasses(int noOfOnlineClasses) {
		if(noOfOnlineClasses>=2 & noOfOnlineClasses<=5) {
		this.noOfOnlineClasses = noOfOnlineClasses;
		}
		else {
			System.out.println("Change could not be made");
		}
	}

	public double getVLabFee() {
		return VLabFee;
	}

	public void setVLabFee(double vLabFee) {
		this.VLabFee = vLabFee;
	}
	
	public double calculateSemesterFee() {
		double Total = (super.getCoarseFee()+this.VLabFee)*this.noOfOnlineClasses;
		double Pay  = Total*0.75;
		return Math.round(Pay);
	}
	public String toString() {
		String Str = "";
		Str+=super.toString()+"\n";
		Str+="Your total fee for your "+this.noOfOnlineClasses+ " online calsses is: \n $"+calculateSemesterFee();
		return Str;
	}
}
