
import java.util.Arrays;

public class OperationFury {
    public static void main(String[] args) {

        // PRACTICING AND EXPERIMENTING MY WEAKNESS
        // HOW TO DECLARE AN ARRAY

        //METHOD 1

        System.out.println("First way of declaring Arrays");

        int a[] = new int[4];
        a[0]=28;
        a[1]=29;
        a[2]=30;
        //what happens when I say array size is 4 beforehand and only declare 3. Lets find out
        System.out.println("\nFixed size array of 4. But only 3 values assigned " +Arrays.toString(a));

        System.out.println("Second way of declaring Arrays");
        float b[] = {27.9f,65.3f,176.98f,54.8716f}; // forgot to add f after numbers at first
        System.out.println("Free sized Arrays. We can add as many numbers as we want inside this Array: "+ Arrays.toString(b));
    
        int c[] = {61,87,15,716,8166,615};
        System.out.println("\nArrays before sorting "+ Arrays.toString(c));
        Arrays.sort(c);
        System.out.println("Arrays after sorting " + Arrays.toString(c));

        System.out.println("\nPrinting a single number from Array");
        double d[] ={98.61,715.73,817.981,71.6,1.6251};
        for(double value:d) {
            System.out.println(d[4]);
            break;
        }
         
        System.out.println("\nTrying to understand the difference between i<=5, i<5, i<arr.length, i<=arr.length, i<arr.length-1, i<=arr.length-1");

        int arr[]= {1,2,3,5,7};

        /*System.out.println("\nImplementing hardcode i<=5 to print this Array");
        for(int i=0;i<=5;i++){
            System.out.println(arr[i]);
        } */
        //OUTPUT
        /*Implementing hardcode i<=5 to print this Array
1
2
3
5
7
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
        at OperationFury.main(OperationFury.java:43) */

        System.out.println("\nImplementing hardcode i<5 to print this Array");
        for(int i=0;i<5;i++){
            System.out.println(arr[i]);
        }
        //PRINTED EVEYTHING WITH NO ERROR

        System.out.println("\nImplementing i<arr.length to print this Array");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        //PRINTED EVERYTHING WITH NO ERROR
        
        /*System.out.println("\nImplementing i<=arr.length to print this Array");
        for(int i=0;i<=arr.length;i++){
            System.out.println(arr[i]);
        } */
        //OUTOUT
        /*Implementing i<=arr.length to print this Array
1
2
3
5
7
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
        at OperationFury.main(OperationFury.java:68) */

        System.out.println("\nImplementing i<arr.length-1 to print this Array");
        for(int i=0;i<arr.length-1;i++){
            System.out.println(arr[i]);
        }
        //PRINTED TILL 5 , 7 WAS NOT PRINTED

        System.out.println("\nImplementing i<=arr.length-1 to print this Array");
        for(int i=0;i<=arr.length-1;i++){
            System.out.println(arr[i]);
        }
        //PRINTED EVERYTHING WITH NO ERROR
    }
}
