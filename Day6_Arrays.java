import java.util.Arrays;

public class Day6_Arrays {
    public static void main(String[] args) {
        
        System.out.println("WAYS WE CAN DECLARE ARRAYS - METHOD 1");
        int i[] = new int[2];
        i[0] = 19;
        i[1] = 21;

        System.out.println(Arrays.toString(i));

        System.out.println("\nWAYS WE CAN DECLARE ARRAYS - METHOD 2");

        int j[] = {415,18,91,4,1289};

        System.out.println(Arrays.toString(j));

        System.out.println("The length of the Array of Method 2 is : " + j.length);
        
        System.out.println("\nPRINTING NUMBERS IN ARRAY USING FOR LOOP");
        int b[] = {817,91,635,523,76,1675,15654,16};

        for(int z=0; z<b.length; z++) {
            System.out.println(b[z]);
        }
    }
}
