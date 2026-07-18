
public class Day10_Constructors {
	
	// 1st type of method - No params, No return value
	void n1() {
		System.out.println("\nn1 - This method has no params and no return value. Hello");
	}
	
	// 2nd type - No params, Return value
	
	String n2() {
		return("\nn2 - No params, only return value");
	}

	 public static void main(String args []) {
		 
		 System.out.println("\nMethods are things that take actions. Methods performs actions through objects");
	 
		 System.out.println("\nThere are 4 ways / types of Methods");
	 
		 Day10_Constructors a = new Day10_Constructors();
		 
		 a.n1();
		 
		String s = a.n2();
	 
		System.out.println("\n"+s);
	 }
}
