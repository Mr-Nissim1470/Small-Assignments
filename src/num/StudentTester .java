package num;

public class StudentTesterYosef {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//Testing the UniversiySudentClass
		UniversityStudentYosef nul = new UniversityStudentYosef();
		System.out.println(nul+"\n");
		System.out.println(nul.getSSN()+"\n");
		
		UniversityStudentYosef Ava = new UniversityStudentYosef("Ava","Ruso","456839681",2019,"Mathmatics",14,420.69);
		System.out.println(Ava+"\n");
		
		System.out.println(Ava.getSSN()+"\n");
		
		//Testing the Online Student Class
		OnlineStudent Lindsey = new OnlineStudent();
		System.out.println(Lindsey+"\n");
		
		OnlineStudent Seethal = new OnlineStudent("Seethal","Doki","731439503",2018,"IT",11,282.30,3,200.00);
		System.out.println(Seethal+"\n");
		
		OnlineStudent Hacker = new OnlineStudent("Mysterious","Man","454554545",2000,"??",11,111,0,0.00);
		Hacker.setNoOfOnlineClasses(7);
		System.out.println(Hacker+"\n");
	
		//Testing the BlendflexStudent class
		BlendFlexStudent sue = new BlendFlexStudent();
		sue.setNoOfBlendflexClasses(3);
		sue.setNoOfOnlineClasses(3);
		System.out.println(sue+"\n");
		
		BlendFlexStudent Jo = new BlendFlexStudent("Joseph","Nahon","789406100",2020,"Bio",1,100,3,3);
		System.out.println(Jo+"\n");
		
		BlendFlexStudent Celest = new BlendFlexStudent("Celest","Winters","145683968",2020,"Communications",6,110,3,2);
		System.out.println(Celest+"\n");
		System.out.println(Celest.getSSN());
		
		//Professor Kumar's examples
		
		UniversityStudentYosef John = new UniversityStudentYosef("John", "Doe", "123-123-1234", 2019, "Programming", 2, 50.00);
		System.out.println(John);
		OnlineStudent s1 = new OnlineStudent("John", "Smith", "123-456-7890", 2018, "Math", 32, 10.50, 3, 10.00 );
		System.out.println(s1);        
		double semFee = s1.calculateSemesterFee();        
		System.out.println("John Smiths semester Fee: " + semFee);        
		BlendFlexStudent s2 = new BlendFlexStudent( "Jack", "Smith", "111-111-1111", 2017, "Science", 27, 100.50, 3, 1);
		System.out.println(s2);        
		semFee = s2.calculateSemesterFee();
		System.out.println("Jack Smiths semester Fee: " + semFee);
		
		
		
	}

}
