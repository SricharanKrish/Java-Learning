
public class Practice_Day03 {
	public static void main(String[] args) {
		
		int maths = 85;
		int science = 91;
		int english = 78;
		
		int total = maths + science + english;
		System.out.println("Total Marks : " + total);
		System.out.println("Maths multiplied by English is : "+ maths * english);
		System.out.println("Science divided by Maths is : " + science/maths);
		System.out.println("Reminder(modulo) of Science by Maths is : " + science % maths);
			
		System.out.println("\nIs Maths greater than Science? "+ (maths>science));
		System.out.println("Are Maths and Science equal? "+ (maths==science));
		System.out.println("Is Science greater than or equal to English? "+ (science>=english));
		System.out.println("Is Maths not equal to English? "+ (maths!=english));

		boolean hasHallTicket = true;
		boolean hasIDCard = false;
		
		System.out.println("\nCan write exam " + (hasHallTicket&&hasIDCard));
		System.out.println("Can enter campus " + (hasHallTicket||hasIDCard));
		System.out.println("Not operator implementation. Will print opposite of value assigned. For hallticket " + (!hasHallTicket));
		System.out.println("Not operator implementation. Will print opposite of value assigned. For ID card " + (!hasIDCard));
	
		System.out.println("\nOriginal Maths : " + maths);
		maths++;
		System.out.println("After Increment : " + maths);
		
		System.out.println("\nOriginal English : " + english);
		english--;
		System.out.println("After Decrement : "+ english);
	
		System.out.println("\nPost Increment :");
		int tamil = 91;
		System.out.println("Tamil marks before Post Increment is : "+tamil);
		int revalTamil = tamil++;
		System.out.println("Post Increment will first assign and then increment so Tamil mark should remain 91 here : " + revalTamil);
	
		System.out.println("\nPre Increment :");
		int russian = 86;
		System.out.println("Russian marks before Pre Increment is : "+russian);
		int revalRussian = ++russian;
		System.out.println("Pre Increment will increment first and assign. So Russian mark should be 87 here : " +revalRussian);
		
		int attendance = 80;
		System.out.println("\nInitial value of attendance : " +attendance);
		attendance+=5;
		System.out.println("Using assignment operators to do arithemtic calculations. Adding 5 here : "+attendance);
		attendance-=10;
		System.out.println("Using assignment operators to do arithemtic calculations. Subtracting 10 here : "+attendance);
		attendance*=2;
		System.out.println("Using assignment operators to do arithemtic calculations. Multiplying 2 here : "+attendance);
		attendance/=3;
		System.out.println("Using assignment operators to do arithemtic calculations. Dividing by 3 here : "+attendance);
		attendance%=4;
		System.out.println("Using assignment operators to do arithemtic calculations. Using modulo to get reminder here by doing modulo 4 here : "+attendance);
	
		int compareMarks = (maths>science)?maths:science;
		System.out.println("\nTernary Operator. Higher mark between Maths and Science : " + compareMarks);
	}	
	

}
