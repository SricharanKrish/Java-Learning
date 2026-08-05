import java.util.Scanner;
public class Expr2 {

    int num;
    String name;

    void getNum() {
        //this.num=num;
        System.out.println("Please enter your ID : ");
        Scanner sc = new Scanner(System.in);
        int answer = sc.nextInt();
        if(answer==16541) {
            System.out.println("Your ID is Authenticated. Please move to the next step.");
            getName();
        }
        else {
            System.out.println("Authentication failed.");
        }
    }

    void getName() {
        //this.name=name;
        System.out.println("\nPlease enter your name : ");
        Scanner nm = new Scanner(System.in);
        String nameAnswer= nm.next();
        if(nameAnswer.equals("Leonel")) {
            System.out.println("Authentication success. You may enter.");
        }
        else {
            System.out.println("Authentication for name failed.");

        }
    }

    public static void main(String[] args) {
        Expr2 obj = new Expr2();
        obj.getNum();
        //obj.getName();
        }
    }
