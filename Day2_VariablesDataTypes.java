public class Day2_VariablesDataTypes {

    public static void main(String[] args) {

// NUMERIC DATA TYPES - INT, BYTE, SHORT, LONG

        int a = 100;
        int b = 200;

        // a and b are variables and their data type is int

        System.out.println(a);
        System.out.println(b);
        System.out.println(a+b);

        
        byte c = 124;
        System.out.println(c);

 
        short d = 260;
        System.out.println(d);


        long e = 176865677647545l; 
        // use l or L at the end if num too big. 
        // This is called using a literal.
        System.out.println(e);


        // DECIMAL DATA TYPES - FLOAT, DOUBLE

        float f = 1657.98f; // needs literal f or F at end 
        // like long data type
        System.out.println(f);

        double g = 54612.76583654;
        System.out.println(g);


        // CHARACTER DATA TYPE

        char h = 'B';
        System.out.println(h);


        // STRING DATA TYPE - CHAR only allows 1 character   
        // STRING ALLOWS MULTIPLE CHARACTERS

        String k = "HELLO, MY NAME IS SRI! NOW SAY MY NAME!";
        System.out.println(k);

        // boolean data type - to check true or false

        boolean i =true;
        boolean j = false;
        System.out.println(i);
        System.out.println(j);
    }
    
}
