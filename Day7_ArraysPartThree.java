public class Day7_ArraysPartThree {
    
    public static void main(String args []) {

        int a[] = {10,20,30,40,50,60,154,6515};

        System.out.println("Find / Search the number in an array");
        
        int find_num = 154;
        
        int count = 0;
        for(int i=0; i<=a.length-1; i++) {
            System.out.println(a[i]);

            if(find_num==a[i]) {
                System.out.println("Number we are searching for has been found in the Array");
                count++;
                break;
            }

            if(count!=1) {
                System.out.println("Number we are searching for has NOT been found in the Array");
            }

        }
            
        
    }
}
