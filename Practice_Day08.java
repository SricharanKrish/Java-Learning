public class Practice_Day08 {
    
    public static void main(String[] args) {
        String employeeName = "      Mike Locke      ";
        String employeeCode = "EMP-105-QA";
        String department = "Automation Testing";
        String email = "Mike.Locke@Virtusa.com";
        String salary = "$62,000";

        System.out.println("The length of employee name is : " + employeeName.length());
        String trimName = employeeName.trim();
        System.out.println("\nThe length of employee name after trimming empty spaces is : " + trimName.length());
        System.out.println("\nPrinting employee name after removing spaces :" + trimName);
        String welcomeMsg1 = "Welcome ";
        String welcomeMsg2 = " to Virtusa";
        System.out.println(welcomeMsg1.concat(trimName).concat(welcomeMsg2)); 

        System.out.println("\nExtracting first character from department : "+department.charAt(0));
        System.out.println("Extracting the last character from department : "+department.charAt(department.length()-1));
    
        System.out.println("\nChecking whether department contains Automation :" + department.contains("Automation"));
        
        String department2 = "automation testing";

        System.out.println("\nChecking equals  " + department.equals(department2));
        System.out.println("Checking equalsIgnoreCase " + department.equalsIgnoreCase(department2));

        System.out.println("\nReplacing Automation with QA in department :" + department.replace("Testing", "QA")); // ITS IMMUTABLE RIGHT? ONLY IN THIS PARTICULAR LINE IT WILL CHANGE?

        System.out.println("\nRetrieving particular characters using substring : " + employeeCode.substring(4,7));
        
        System.out.println("\nConverting employee name to UPPERCASE : "+employeeName.toUpperCase());
        System.out.println("Converting employee email to lowercase : "+email.toLowerCase());

        System.out.println("\nUsing split function"); 
        String split[] = employeeCode.split("\\-");
        System.out.println(split[0]);
        System.out.println(split[1]);
        System.out.println(split[2]);

        System.out.println("\nUsing replace to cleanup salary : "+salary.replace("$", "").replace(",", ""));
    
    }
}
