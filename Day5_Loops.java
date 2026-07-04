public class Day5_Loops {
    public static void main(String[] args) {
        System.out.println("WHILE LOOP");

        int i = 1; // initilization
        while(i<=10) { // condition
            System.out.println(i);
            i++; // incrementation
        }

        System.out.println("\nDO WHILE LOOP");

        int r=11;
        do {
            System.out.println(r);
            r++;
        } while(r<=10);

        System.out.println("\nFOR LOOP");


        for(int y=15; y>=0; y--) {
            System.out.println(y);
        }
          
    }
}
