
public class Day10_MethodParamterTypes {
	
	// 1st type of method - No params, No return value
	void n1() {
		System.out.println("\nn1 - This method has no params and no return value. Hello");
	}
	
	// 2nd type - No params, Return value
	
	String n2() {
		return("\nn2 - No params, only return value");
	}
	
	//3rd type - Takes params, no return value
	
	void n3(String name) {
		System.out.println("\nn3 - Takes params, no return value. Hello " + name);
	}
	
	//4th type - Takes params, returns value
	
	String n4(int r) {
		return("The number is " + r);
	}
	
	

	 public static void main(String args []) {
		 
		 System.out.println("\nMethods are things that take actions. Methods performs actions through objects");
	 
		 System.out.println("\nThere are 4 ways / types of Methods");
	 
		 Day10_MethodParamterTypes a = new Day10_MethodParamterTypes();
		 
		 a.n1();
		 
		String s = a.n2();
		// since n2 contains only return statement
		// and no print statement
		// we have to store it in another variable like
		// String s and then print it
	 
		System.out.println(s);
		
		a.n3("Sri"); 
		
		System.out.println("\nn4 -Takes params, returns value " + a.n4(617));
		// n4 has only return statement
		// no print statement
		// in n2 we stored it another variable String s
		// and then printed it.. for n4 we are using
		// direct print statement
	 }
}
