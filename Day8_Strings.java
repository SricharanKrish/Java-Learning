public class Day8_Strings {
    
    public static void main(String[] args) {
        
        System.out.println("To find the length of a String");
        String s = "Welcome, Sri";

        System.out.println(s.length());

        System.out.println("\nTo concat / join 2 Strings");

        String a = "Hello, my name";
        String b =" is John Locke";

        System.out.println(a.concat(b));

        System.out.println("\nRemove spaces in between Strings");

        String z = "      Hello    ";
        System.out.println("Before removin spaces " + z);

        String z1 = z.trim();
        System.out.println("After removing spaces " + z1);
        
        System.out.println("\nRemove spaces between strings aka Trim function");
        
        String r = "     Hello     ";
        System.out.println("Before Trim " + r);
        
        String r1 = r.trim();
        System.out.println("After using Trim " + r1);
        
    }
}
