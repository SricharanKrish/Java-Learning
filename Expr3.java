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

         

    }
    
}
