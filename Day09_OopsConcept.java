
public class Day09_OopsConcept {
	
	// Variables
	
	int eid;
	String ename;
	String job;
	int sal;
	
	// Method
	void display() {
		System.out.println(eid);
		System.out.println(ename);
		System.out.println(job);
		System.out.println(sal);
	}
	
	
	public static void main(String[] args) {
		Day09_OopsConcept a = new Day09_OopsConcept();
		
		a.eid=10019;
		a.ename = "Batman";
		a.job = "CEO of Bats";
		a.sal = 1000000000;
		
		a.display();
		
	}
}
