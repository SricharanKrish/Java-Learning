
public class Practice_Day02 {

	public static void main(String args []) {
		
		int empId = 105;
		System.out.println("Employee ID " + empId);
		
		int empAge = 29;
		System.out.println("Age " + empAge);
		
		float empSal = 58750.75f;
		System.out.println("Salary " + empSal);
		
		double empBonus = 4500.50;
		System.out.println("Bonus "+ empBonus);
		
		long empPhone = 9876543210l;
		System.out.println("Phone Number " + empPhone);
		
		char empGrade = 'A';
		System.out.println("Grade " + empGrade);
		
		String empName = "Mike Locke";
		System.out.println("Employee Name " + empName);
		
		boolean isPermEmp = true;
		System.out.println("Is Permanent Employee " + isPermEmp);
		
		float totalEarnings = (float) (empSal + empBonus);
		System.out.println("\nTotal Earnings\n" + totalEarnings);
		
		System.out.println("\n"+empName +" belongs to grade " +empGrade);
	
	}
}
