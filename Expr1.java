public class Expr1 {

    int number;
    String name;
    int arr[];

    Expr1() {
        System.out.println("Default Constructor");
    }

     Expr1(int x, String y){
        this.number=x;
        this.name=y;
        System.out.println(x +" "+ y);
    }

    void readValue() {
        for(int i=0;i<arr.length;i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        Expr1 obj = new Expr1();
        Expr1 obj1 = new Expr1(176178, "Sri");

        int arr[] = {17,81,715,958,417,916,1,615}; 
        obj.arr=arr;

        obj.number=1091;
        System.out.println(obj.number);

        obj.readValue();

    }
    
}
