public class TestNotepad {
	public static void main(String[] args) {
	System.out.println("Hello, World!");

	int a = 10, b= 20;
	System.out.println(a+b);
	
	String b1 = "Hello";
	System.out.println(b1);
	
	float c = 172.971f;
	
	double d = 515.61544;
	
	long e = (long) 715541.6715345;
	System.out.println(e);

	float f = (float) (c+d);
	System.out.println(f);
	
	boolean g = true;	
	boolean h = false;
	System.out.println(g);
	System.out.println(h);
	
	int i=10;
	i+=5;
	System.out.println(i);	

	//post increment
	int j = 98;
	int k = j++;
	System.out.println(k); // or should j come in bracket?
	
	//pre increment
	int l = 15;
	int m = ++l;
	System.out.println(m); // or should l come in bracket?

	// players and goals
	
	int goals [] = {51,17,28,71,8,14};
	int playerNumber = 1;
	int mostGoals = goals[0];
	for(int n=0;n<=goals.length-1;n++){
		System.out.println("Player " + (n+1) + " has " + goals[n] + "goals");
		if(goals[n]>mostGoals){
			mostGoals = goals[n];
            playerNumber = n+1;
	} 
}
		System.out.println("The most goals scored by a player is : " + mostGoals +" and it was scored by Player " +playerNumber);


    }
}