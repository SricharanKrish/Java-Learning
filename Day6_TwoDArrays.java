public class Day6_TwoDArrays {
    
    public static void main(String args[]) {

        System.out.println("DECLARING A 2D ARRAY");
        int a[][] = {{100,200},{300,400},{500,600}};


        System.out.println("\nFINDING SIZE OF AN ARRAY");

        System.out.println("NUMBER OF ROWS IN 2D ARRAY IS : " +a.length);
        System.out.println("LENGTH OF COLUMNS IS FOUND BY MENTIONING ROW NUMBER : "+a[2].length);
        
        System.out.println("\nREADING A SINGLE VALUE FROM 2D ARRAY");
        System.out.println(a[1][1]);

        System.out.println("\nREADING ALL VALUES FROM 2D ARRAY");

        for(int i=0;i<=2;i++){

            for(int j=0;j<=1;j++)
            System.out.println(a[i][j]);

        }

        System.out.println("\nUSING ENHANCED FOR LOOP TO READ ALL VALUES FROM 2D ARRAY FOR EASIER IMPLEMENTATION");

        for(int arr[]:a){
            for(int z:arr) {
                System.out.println(z);
            }
        }
        
    
    }   
}
