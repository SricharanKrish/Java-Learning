public class Enhancedloop {
    public static void main(String[] args) {

        // NORMAL FOR LOOP 

            for(int i=1;i<=5;i++){
                System.out.println("Normal for loop : " + i);
            }

            int arr[] = {26,19,17,48,61,81};
            for(int n:arr){
                System.out.println(n);
            }

            for(int y=0;y<arr.length;y++) {
                System.out.println("\n"+arr[y]);
            }

            System.out.println(arr[3]); 

            System.out.println("\nFinding highest number in an array using normal for loop :");

            float [] z = {151.7176f,7153.7156f,819.71f,1312.717f,1312.817f};
            float maxVal = z[0];
            for(int r=0;r<z.length;r++) {
                 if(z[r] > maxVal) {
                    maxVal = z[r];
                 }
            }
                System.out.println("\nThe highest value is : " + maxVal);

                System.out.println("\nFinding highest number in an array using enhanced for loop :");

                float [] z1 = {718.91f,817.981f,817.9811f,801.91f};

                float maxVal1 = z1[0];
                for(float r2:z1){
                    // for(int i=0;i<z1.length;i++){
                    // float r2 = z1[i]; this happens in background 
                    //}
                    if(r2 > maxVal1) {
                        maxVal1 = r2;

                    }
                    
                }
                 System.out.println("\nThe highest value is : "+maxVal1);


    }
}
