public class Day4_ConditionalStatements {

    public static void main(String[] args) {

        System.out.println("If else statement");

        int age = 20;

        if(age>=18) {
            System.out.println("Eligible to vote");
        }

        else {
            System.out.println("Not Eligible to vote");
        }

        System.out.println("\nIf else if if statement");

        int num = 0;

        if(num>0) {
            System.out.println("POSITIVE NUMBER");
        }
        else if(num<0) {
            System.out.println("NEGATIVE NUMBER");
        }

        else {
            System.out.println("NUMBER IS ZERO");
        }

        System.out.println("\nIF ELSE LADDER");
        int day = 1;

        if(day==1) {
            System.out.println("It's Monday");
        }

        else if(day==2) {
            System.out.println("It's Tueday");
        }
        else if(day==3) {
            System.out.println("It's Wednesday");
        }

        else {
            System.out.println("Invalid day");
        }

        int age1 = 21;
        int income = 20000;

    System.out.println("\nNESTED IF ELSE");
    if(age1 >= 18) {
    System.out.println("You are an adult");
    
    if(income >= 30000) {
        System.out.println("You have good income");
    }
    else {
        System.out.println("Your income is low");
    }
}
else {
    System.out.println("You are a minor");
    
}

System.out.println("\nSWITCH CASE STATEMENTS");

    int bestPlayer = 1;

    switch(bestPlayer) {
        case 1 : System.out.println("Messi");
        break;

        case 2 : System.out.println("Neymar");
        break;

        case 3 : System.out.println("Fabregas");
        break;

        default : System.out.println("Aliens have taken over");
    }

    }
    
}
