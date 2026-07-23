
public class Day12_CallByReference {
int number; // belongs to class Day12_CallByValue
	
	void m1(int number) { // belongs to method / local variable
		number = number+10;
		System.out.println("Value in the method " + number);
	}
	
	void m2(Day12_CallByReference t) {
		
		t.number=t.number+10;
		
		System.out.println("Value in the m2 method is : " + t.number);
		
		
	}
	
	public static void main(String args[]) {
		Day12_CallByReference test = new Day12_CallByReference();
		test.number=100;
		
		System.out.println("Value before being passed into m2 : " + test.number);
		
		test.m2(test);
	
		System.out.println("Value before after passed into m2 : " + test.number);
	}
	
	

}
