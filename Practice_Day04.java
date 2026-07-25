public class Practice_Day04 {
	
	public static void main(String args[]) {
		String name = "Mike Locke";
		int age = 29;
		int experience = 5;
		int perfRating = 4;
		int deptCode = 2;
		int salary = 62000;
		
		if(experience>=5) {
			System.out.println("Experienced Employee");
		}
		
		if(salary>50000) {
			System.out.println("\nHigh Salary");
		}
		else {
			System.out.println("Average Salary");
		}
		
		if(perfRating==5) {
			System.out.println("\nOutstanding");
		}
		else if(perfRating==4) {
			System.out.println("Excellent");
		}
		else if(perfRating==3) {
			System.out.println("Good");
		}
		else if(perfRating==2) {
			System.out.println("Needs Improvement");
		}
		else if(perfRating==1) {
			System.out.println("Poor");
		}
		else {
			System.out.println("Invalid Rating");
		}
		
		if(age>=25) {
			if(perfRating>=4) {
				System.out.println("\nEligible for Promotion");
			}
			if(perfRating<4) {
				System.out.println("\nPerformance needs improvement");
			}
		}
			if(age<25) {
				System.out.println("\nToo young for promotion");
			}
			
		switch(deptCode) {
		case 1 : System.out.println("\nTesting");
		break;
		
		case 2 : System.out.println("\nAutomation");
		break;
		
		case 3 : System.out.println("\nDevelopment");
		break;
		
		case 4 : System.out.println("\nDevOps");
		break;
		
		case 5 : System.out.println("\nSupport");
		break;
		
		default : System.out.println("\nUnknown Department");
		
		}
		
		System.out.println("\nChecking Employee IDs...");
		for(int empId=1001; empId<=1020; empId++) {
			System.out.println("\nChecking "+empId);
			if(empId%8==0) { // note to chatgpt.. you asked me to do by 7.. that would have stopped at 1001 itself, so I did with 8 instead
				System.out.println("First divisible by 8 :"+empId);
				break;
			}
		}
		
		for(int i=1;i<=10;i++) {
			if(i==4 || i==7) {
				continue;
				}
			System.out.println(i);
		}
		
	}
	
	
}
