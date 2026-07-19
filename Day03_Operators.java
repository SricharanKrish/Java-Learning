public class Day03_Operators {
    
    public static void main(String[] args) {

        // ARITHMETIC OPERATORS ARE +,-,*,/,%

        int a = 20, b=10;

        System.out.println("ARITHMERIC OPERATORS");

        System.out.println("Addition : " + (a+b));
        System.out.println("Subtraction : " + (a-b));
        System.out.println("Multiplication : " + (a*b));
        System.out.println("Division : " + (a/b)); // quotient
        System.out.println("Modulo : " + (a%b)); // reminder


        //RELATIONAL OPERATORS- > >= < <= != ==
        System.out.println("\nRELATIONAL OPERATORS / COMPARISON OPERATORS");

        System.out.println(a>b);
        System.out.println(a>=b);
        System.out.println(a<b);
        System.out.println(a<=b);
        System.out.println(a!=b);
        System.out.println(a==b);


        // LOGICAL OPERATORS  && || !
        System.out.println("\nLOGICAL OPERATORS");

        boolean c = true;
        boolean d = false;

        System.out.println(c && d);
        System.out.println(c || d);
        System.out.println(!c);
        System.out.println(!d);


        System.out.println("\n INCREMENT AND DECREMENT OPERATORS");

        int x = 10;
        x++;

        System.out.println(x);

        // POST INCREMENT
        int y = 20;
        int result = y++;
        System.out.println(result); // 20 IS ASSIGNED TO RESULT AND ONLY AFTER
        // THAT IT IS INCREMENTED, SO IT RETURNS 20 ONLY NOT 21

        // PRE INCREMENT

        int z = 30;
        int zresult = ++z;

    System.out.println(zresult); // FIRST INCREMENT OCCURS AND THEN
    // ASSIGNMENT OCCURS.. SO IT RETURNS 31

    
    System.out.println("\n ASSIGNMENT OPERATORS");

    int m = 100;
    m+=10;

    System.out.println(m);


    System.out.println("\n TERNARY OPERATOR");

    int r = 200, s= 100;

    int output = (r<s)?r:s; // if expression r<s is true, result 1 (r)
    // Will be assigned to output, if false result 2 (s) will be assigned 

    System.out.println(output);



    }
}
