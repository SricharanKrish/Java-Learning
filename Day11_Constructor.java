
public class Day11_Constructor {
	
	int sid;
	String sname;
	char grade;
	
	Day11_Constructor(int id, String name, char g){
		sid = id;
		sname = name;
		grade = g;
	}
	
	//constructor will automatically invoke when object is created
	
	// methods have to be called explicitly via object
	// like s.setStuData()
	
	void printStudentData() {
		System.out.println(sid+" " +sname + " "+grade);
	}
	
	public static void main(String[] args) {
		
		// constructor invoking automatically below
		// when obj created
		// unlike methods where you have to invoke 
		// like s.setStuData()
		
		Day11_Constructor s = new Day11_Constructor(8156543, "Sachin", 'A');
		
		s.printStudentData();
		
	}
}
