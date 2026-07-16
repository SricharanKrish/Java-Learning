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
        System.out.println("Before removing spaces " + z);

        String z1 = z.trim();
        System.out.println("After removing spaces " + z1);
        
        System.out.println("\nRemove spaces between strings aka Trim function");
        
        String r = "     Hello     ";
        System.out.println("Before Trim " + r);
        
        String r1 = r.trim();
        System.out.println("After using Trim " + r1);
        
        
        System.out.println("\nTo get a single character from a String");
        
        String zj = "AmorFati";
        
        System.out.println(zj.charAt(3));
        
        System.out.println("\nTo check if a String contains something. For example if a characters are present in String");
        
        String rq = "HolaAmigo";
        
        System.out.println(rq.contains("laAm"));
        
        System.out.println("\nEquals and EqualsIgnorecase to compare 2 Strings");
        
        String z6 = "Vanakkam";
        String z7 = "vanakkam";
        
        System.out.println(z6.equals(z7));
        
        System.out.println(z6.equalsIgnoreCase(z7));
    
        System.out.println("\nReplace function");
        
        String y6 = "Sricha";
        
        System.out.println(y6.replace('a','h'));
        
        System.out.println("\nTo extract more than 1 character from a String. CharAt is only for extracting single character");
        
        String e = "Welcome home, Sri!";
        // count starting index from 0 and ending index from 1
        System.out.println(e.substring(2, 5));
        // characters between 2 and 5 will be retrieved
    
    }
}
