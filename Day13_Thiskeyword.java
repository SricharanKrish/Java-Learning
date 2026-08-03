public class Day13_Thiskeyword {

        int x, y; // class variables / instance variables

        void setData(int a, int b) { //  a, b are local variables
            x=a;
            y=b;
        }

        void display(){
            System.out.println(x+"  "+y);
        }

        void setData2(int x, int y) { // to use same variable names in both class variables and local variables use "this" keyword here
            this.x=x;
            this.y=y;
            // this is a keyword that ALWAYS REPRESENTS THE CLASS
            // so when we write this.x, it means x in class (class variable / instance variable)
        }

        public static void main(String[] args){
            Day13_Thiskeyword z = new Day13_Thiskeyword();

            z.setData2(10,20);
            z.display();
        }
}