package num;

public class BlendFlexStudent extends UniversityStudentYosef {
	
	private int noOfOnlineClasses; 
	
	private int noOfBlendflexClasses; 
	
	
	BlendFlexStudent(){
		this.noOfBlendflexClasses = 1;
		this.noOfOnlineClasses = 0;
	}
	
	BlendFlexStudent(String FN,String LN,String ssn,int SY,String D,int DC, double CF, int BFC,int OC){
		super(FN,LN,ssn,SY,D,DC,CF);
		if (BFC+OC<=5 & BFC>=1 & OC>=0) {
			this.noOfBlendflexClasses = BFC;
			this.noOfOnlineClasses = OC;
		}
		else {
			System.out.println("One of your enteries are invalid \n Your coarses were auto set to:"
					+ "\n 1 Blendflex calss"
					+ "\n 0 Online classes");
			this.noOfBlendflexClasses = 1;
			this.noOfOnlineClasses = 0;
		}
	}

	public int getNoOfOnlineClasses() {
		return noOfOnlineClasses;
	}

	public void setNoOfOnlineClasses(int noOfOnlineClasses) {
		if (noOfOnlineClasses>=0 & (noOfOnlineClasses+noOfBlendflexClasses)<=5) {
		this.noOfOnlineClasses = noOfOnlineClasses;
		}
		else {
			System.out.println("Change cannot be made");
		}
	}

	public int getNoOfBlendflexClasses() {
		return noOfBlendflexClasses;
	}

	public void setNoOfBlendflexClasses(int noOfBlendflexClasses) {
		if (noOfBlendflexClasses>=1 & (noOfOnlineClasses+noOfBlendflexClasses)<=5) {
		this.noOfBlendflexClasses = noOfBlendflexClasses;
		}
		else {
			System.out.println("Change can't be made");
		}
	}
	public double calculateSemesterFee(){
		double BFCfee = (super.getCoarseFee()*this.noOfBlendflexClasses)*1.20;
		double OCfee = (super.getCoarseFee()*this.noOfOnlineClasses)*0.80;
		double Total = BFCfee+OCfee;
		return Math.round(Total);
	}
	public String toString() {
		String str = "";
		str+= super.toString()+"\n";
		str+= "Your total fee for \n"+this.noOfBlendflexClasses+" Blend Flex coarse and \n"+this.noOfOnlineClasses+" Online classes "
				+ "\nAmounts to:\n"+calculateSemesterFee();
		return str;
	}
	}

