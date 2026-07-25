public class Practice_Day05 {
    public static void main(String[] args) {
        int i=1;

        while(i<=10) {
            System.out.println("Push-up " +i+ " completed");
            i++;
        }

        int members=0;
        do {
            System.out.println("Checking gym...");
           // members++; // IMPLEMENTED MEMBERS++ OUTSIDE BELOW WHILE(MEMBERS>0) LINE INTIALLY. IF NEED TO BE IMPLEMENTED IN CERTAIN CASES IT SHOULD BE BELOW PRINT STATEMENT INSIDE DO {}
        } while(members>0);

        for(int count=5;count>0;count--){
            System.out.println(count);
        }
        System.out.println("Lift"); //DONT KNOW IF LIFT SHOULD BE IMPLEMENTED OUTSIDE OF FOR LOOP

        
        for(int locker=101;locker<=120;locker++) {
            System.out.println("\nChecking Locker "+locker);
            if(locker==112) {
                System.out.println("\nLocker Found!");
                break;
                }
        }

        for(int num=1;num<=10;num++) {
            if(num==3 || num==6 || num==9) {
                continue;
            }
            System.out.println("Exercise "+num);
        }

        //PUSH THIS TO GITHUB WITH COMMENT PLACES WHERE I HAVE STRUGGLED
        // 1. TERNARY OPERATOR. DID NOT UNDERSTAND HOW TO IMPLEMENT THIS LOGIC BEFORE CHATGPT EXPLAINED CLEARLY
        // 2. NESTED IF - DIDNT KNOW ELSE CAN BE USED.. IT JUST NEEDS IF INSIDE AN IF
        // 3. CONTINUE AND BREAK.. NOT SURE WHERE TO USE PRINT STATEMENTS
        // FOR EXAMPLE PRACTICE DAY 4 - 73 TO 78 LINES. STRUGGLED WITH WHERE TO WRITE LINE 73, 75 PRINT STATEMENTS FIRST
        // FOR EXAMPLE PRACTICE DAY 4 - 82 TO 86 LINES. STRUGGLED WITH WHERE TO WRITE LINE 86 PRINT STATEMENTS FIRST
        // IN THIS PROGRAM 22 - 26 LINES. STRUGGLED WITH WHERE TO WRITE LINE 23 PRINT STATEMENT AT FIRST
    }
}
