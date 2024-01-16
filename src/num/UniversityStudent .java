package num;
import java.util.*;
public class UniversityStudentYosef {

	private String FirstName;
	private String LastName;
	private String IDnumber;
	private String SSN;
	private int StartYear;
	private String Department;
	private int DepartmentCode;
	private double CoarseFee;
	
	UniversityStudentYosef(){
		this.FirstName = "Sue";
		this.LastName = "Allen";
		this.IDnumber = "NA-1470";
		this.SSN = "987654321";
		this.StartYear = 2021;
		this.Department = "TBD";
		this.DepartmentCode = 0;
		this.CoarseFee = 0.00;		
	}
	
	UniversityStudentYosef(String FN,String LN,String ssn,int SY,String D,int DC, double CF){
		this.FirstName = FN;
		this.LastName = LN;
		this.SSN = ssn;
		this.StartYear = SY;
		this.Department = D;
		this.DepartmentCode = DC;
		this.CoarseFee = CF;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getSSN() {
		String ssn = "";
		for(int j =0 ;j<SSN.length();j++)
			if(j==3|j==5) {
				ssn+="-";
				ssn+=SSN.charAt(j);
				}
			else {
				ssn+=SSN.charAt(j);
			}
		
		return ssn;
	}

	public void setSSN(String sSN) {
		String ssn = "";
		for(int j =0 ;j<SSN.length();j++)
			if(j==3|j==5) {
				ssn+="-";
				ssn+=SSN.charAt(j);
				}
			else {
				ssn+=SSN.charAt(j);
			}
		for(int i = 0;i<4;i++) {
			ssn+=sSN.charAt(i);
		}
		SSN = sSN;
	}

	public int getStartYear() {
		return StartYear;
	}

	public void setStartYear(int startYear) {
		StartYear = startYear;
	}

	public String getDepartment() {
		return Department;
	}

	public void setDepartment(String department) {
		Department = department;
	}

	public int getDepartmentCode() {
		return DepartmentCode;
	}

	public void setDepartmentCode(int departmentCode) {
		DepartmentCode = departmentCode;
	}

	public double getCoarseFee() {
		return CoarseFee;
	}

	public void setCoarseFee(double coarseFee) {
		CoarseFee = coarseFee;
	}

	public String getIDnumber() {
		return IDnumber;
	}
	
	public String CreateIDNumber() {
		String L = this.LastName.substring((LastName.length())-1);
		String F = this.FirstName.substring((FirstName.length())-1);
		String FD = ""+this.StartYear%2000; 
		String LD = ""+(int)(10+90*Math.random());
		String Pass = F.toUpperCase()+L.toUpperCase()+"-"+FD+LD;
		return Pass;
	}
	
	public String toString() {
		String STR = "";
		STR+= "Name: "+this.FirstName+" "+this.LastName+"\n"
				+ "Started: "+this.StartYear+"\n"
						+ "Department: "+this.Department+". Number: "+this.DepartmentCode+"\n"
								+ "ID: "+ CreateIDNumber()+"\n"
										+ "Fee: $"+this.CoarseFee;
		return STR;
	}
	
}
