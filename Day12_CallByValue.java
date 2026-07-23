
public class Day12_CallByValue {

	
	int number; // belongs to class Day12_CallByValue
	
	void m1(int number) { // belongs to method / local variable
		number = number+10;
		System.out.println("Value in the method " + number);
	}
	
	public static void main(String args []) {
		Day12_CallByValue test = new Day12_CallByValue();
	
		int number = 100;
		System.out.println("Before passing variable into method " + number);
		
		test.m1(number); // call by value 
		
		// we only send a copy of the number into method m1
		// so only inside method number becomes 110
		//outside method original val of number remains 100
		System.out.println("After passing variable into method " + number);
		
		
		
	}
}
