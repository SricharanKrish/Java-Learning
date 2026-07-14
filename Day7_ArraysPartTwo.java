import java.util.Scanner;

public class Day7_ArraysPartTwo {
    public static void main(String[] args) {

        System.out.println("USING SCANNER TO TAKE INPUT AT RUNTIME INSTEAD OF HARDCODING INPUT IN CODE");

        Scanner sc = new Scanner(System.in); 
        // system.in because we are taking input from keyboard at runtime

        System.out.println("Enter a number: ");
        int a = sc.nextInt(); // instead of int a = 10; hardcodin   g, we are using sc.nextInt to take input at runtime
        System.out.println("The value of a is: "+ a);

    }
}
