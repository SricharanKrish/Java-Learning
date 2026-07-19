import java.util.Arrays;

public class Day06_Arrays {
    public static void main(String[] args) {
        
        System.out.println("WAYS WE CAN DECLARE ARRAYS - METHOD 1");
        int i[] = new int[2];
        i[0] = 19;
        i[1] = 21;

        System.out.println(Arrays.toString(i));

        System.out.println("\nWAYS WE CAN DECLARE ARRAYS - METHOD 2");

        int j[] = {415,18,91,4,1289};

        System.out.println(Arrays.toString(j));

        System.out.println("\nThe length of the Array of Method 2 is : " + j.length);
        
        System.out.println("\nPRINTING NUMBERS IN ARRAY USING FOR LOOP");
        // DECLARE AN ARRAY
        int b[] = {817,91,635,523,76,1675,15654,16};

        System.out.println("\nREADING SINGLE VALUE FROM ARRAY");
        // READ SINGLE VALUE FROM ARRAY
        for(int value:b) {
            System.out.println(b[4]);
        }


        System.out.println("\nREADING MULTIPLE VALUES FROM ARRAY");

        // READ MULTIPLE VALUES FROM ARRAY
        for(int z=0; z<b.length; z++) {
            System.out.println(b[z]);

             }
             
        System.out.println("\nFIND LENGTH / SIZE OF AN ARRAY");
        System.out.println(b.length);
       
    
            }
}
