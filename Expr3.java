import java.util.Arrays;

public class Expr3 {

    public static void main(String[] args) {

        System.out.println("Day1");
        System.out.println("Hello, World!");

        System.out.println("\nDay2");

        int a=10,b=20;
        System.out.println(a+" "+b);

        float c = 816.615f;
        System.out.println(c);

        double d = 1561.78165;
        System.out.println(d);

        long e = 62653571L;
        System.out.println(e);

        System.out.println("\nDay3");
        System.out.println("ARITHMETIC OPERATORS");

        System.out.println("Addition operator " +(a+b));
        System.out.println("Subtraction operator "+ (a-b));
        System.out.println("Multiplication operator "+ (b*a));
        System.out.println("Division operator " +(b/a));
        System.out.println("Modulo operator "+ (b%a));

        System.out.println("\nRELATIONAL / COMPARSION OPERATORS");
        System.out.println("Greater than: "+ (b>a));
        System.out.println("Greater than or equal to: " +(b>=a));
        System.out.println("Lesser than: " +(b<a));
        System.out.println("Lesser than or equal to: " + (b<=a));
        System.out.println("Comparing whether 2 values are equal: "+ (b==a));
        System.out.println("Not equal to: "+(b!=a));

        System.out.println("\nLOGICAL OPERATORS");
        boolean f= true;
        boolean g=false;
        System.out.println("AND OPEATOR: "+(f&&g));
        System.out.println("OR OPERATOR: "+(f||g));
        System.out.println("NOT OPERATOR: "+(!g));

        System.out.println("\nASSIGNMENT OPERATOR");
        a=30;
        a+=4;
        b-=3;
        c/=2.0;
        d%=3.76;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

        System.out.println("\nTERNARY OPERATOR");
        double h = 1.8971, i=1.89707;
        double j = (h>i)? h:i;
        System.out.println(j);

        System.out.println("\nDay4");

        float a1= 7.716f;
        if(a1>=6) {
            System.out.println("if condition passed");
        }
        else {
            System.out.println("if condition failed");
        }

        float b1 = 7.891f;

        if(a1>=6) {
            if(b1>=9) {
                System.out.println("Nested if condition passed");
            }
            else {
                System.out.println("Nested if condition failed");
            }
        }

        if(a1>=10) {
            System.out.println("checking if else if condition. if condition passed.");
        }
        else if(a1>=6) {
            System.out.println("if-else if condition passed");
        }
        else if(a1>=18) {
            System.out.println("3rd if-else if condition passed");
        }
        else {
            System.out.println("if-else if condition failed");
        }
        
        int c1 = 4;
        switch(c1) {
            case 1 : System.out.println("Switch case 1 passed");
            break;
        
            case 2 : System.out.println("Switch case 2 passed");
            break;

            default : System.out.println("All switch cases failed");
        }

        System.out.println("\nDay5 & Day6");

        float arr[] = {102.91f,134.71f,99.87f,321.981f};
        System.out.println("Printing arrays using normal for loop");
        for(int i1=0;i1<arr.length;i1++){
            System.out.println(arr[i1]);
        } 

      System.out.println("Printing arrays using Arrays.toString[arrayname]: "+Arrays.toString(arr));

        System.out.println("Printing Arrays using Enhanced for loop");
        for(float n:arr) {
            // does float n = arr[i];
            System.out.println(n);
        }

        int w = 409;
        while(w<=413){
            System.out.println("While condition repeats: "+w);
            w++;
        }
        System.out.println("The last value of w is: "+w);
    

    int z=198;
    do{
        System.out.println("Do While will print once even if condition is false: "+z);
        z++;
    }while(z>200);
    System.out.println(z);

    int [][] r = {{100,200},{300,400},{500,600},{1000,1276}};

    for(int i8=0;i8<r.length;i8++){
        for(int i9=0;i9<r[i8].length;i9++){
            System.out.println(r[i8][i9]);
        }
    }

    System.out.println(r.length);
    System.out.println(r[2].length);

    }
}
