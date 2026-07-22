
public class Day10_PartTwoGettersSetters {
	
	int studentid;
	String studentname;
	char grade;
	
	void printStudentData() {
		System.out.println("The student id, name and grade is :" + studentid + "," + studentname + "," + grade );
	}

	void setStudentData(int id, String name, char mark) {
		studentid = id;
		studentname = name;
		grade = mark;
	}
	
	public static void main(String[] args) {
		
		Day10_PartTwoGettersSetters r = new Day10_PartTwoGettersSetters();
		
		// USUALLY WE SET DATA LIKE THIS - this is called using object referrence
		/*Day09_OopsConcept a = new Day09_OopsConcept();
		
		a.eid=10019;
		a.ename = "Batman";
		a.job = "CEO of Bats";
		a.sal = 1000000000;
		*/
		
		// BUT THIS BECOMES DIFFICULT WHEN THERE ARE 100'S OF VARIABLES
		// SO WE ARE GOING TO CREATE A METHOD CALLED SETSTUDENTDATA..CHECK ABOVE
		
		// this is called assigning data using user defined method
		
		// 3rd is constructor.. check day11
		r.setStudentData(16531, "Ramit", 'A');
		r.printStudentData();
	}
}
