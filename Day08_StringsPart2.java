import java.util.Scanner;

public class Day08_StringsPart2 {
	
	public static void main(String[] args) {
		
		System.out.println("\nReverse a String");
		
		String s = "Sricha";
		
		String reverse = "";
		
		for(int i=s.length()-1; i>=0; i--) {
			reverse = reverse+s.charAt(i);
		}
		
		System.out.println(reverse);
		
		
		
		System.out.println("\nTo compare Strings");
		
		System.out.println("\nEnter your String name to enter :");
		
		String a = "AmorFati";
		
		Scanner i = new Scanner(System.in);
		String b = i.next();
		
		if(b.equalsIgnoreCase(a)){
			System.out.println("The two Strings match. You may enter Purgatory");
		}
		else {
			System.out.println("GO TO HELL!");
		}
		
		System.out.println("\nMutable and Immutable Strings");
	
		String h = "Welcome";
		
		System.out.println(h.concat(" Holaa"));
		
		System.out.println("\nThe original String does not change, hence immutable: " +h);
	
		StringBuffer g = new StringBuffer("\nLost");
		g.append("Myself");
		System.out.println("\nStringbuffer is Mutable, it changes original value as well: " + g);
	
		
	}
	
	
}
