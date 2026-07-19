public class Day08_Strings {
    
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
    
        System.out.println("\nTo change String to Uppercase or Lowercase");
        
        
        String u = "sri";
        String u1 = "MESSI";
        
        System.out.println("Converting String to Uppercase " + u.toUpperCase());
    
        System.out.println("Converting String to Lowercase " + u1.toLowerCase());
        
        System.out.println("\nTo split or divide a String");
        
        String s4 = "CANYOUHEARMEPLEASETELL ME?";
        
        String split [] = s4.split("YOU");
        System.out.println(split[0]);
        System.out.println(split[1]);
        
        String amount = "$15,20,55";
        
        //String split1 [] = amount.split("$");
        String split1 [] = amount.split("\\$");
        
        System.out.println(split1[1]);
        
        // split1[0] = everything before the $ = "" (empty string, 
        //since $ is at the start)
    	//split1[1] = everything after the $ = "15,20,55"
     
        
        System.out.println("\nReplace function");
        
        String amount1 = "$16,28,91";
        
        System.out.println(amount1.replace("$", "").replace(",", ""));
        
        String ex = "abc,123@xyz";
        
        System.out.println(ex.replace("@", ""));
    }
}
