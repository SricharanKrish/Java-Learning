public class Exp {
    public static void main(String[] args) {
        System.out.println("Welcome to Java Masterclass. We struggle to succeed!");

        int a=10;
        int b =20;

        float c=17.891f, d=816.165f;

        double e = 8171.76715;

        long f = 617656254L;

        short g = 130;

        boolean h = true;
        boolean i = false;

        a+=3;
        System.out.println(a);
        System.out.println("\n" + (a+b));
        System.out.println(a-b);
        System.out.println(a/b);
        System.out.println(a%b);
        System.out.println(a*b);

        System.out.println(h&&i);
        System.out.println(h||i);
        System.out.println((h&&i) || (h||i));
        System.out.println((h&&i) && (h||i) || (h));
        System.out.println(!i);

        int num = 153;
        System.out.println("\nDetermine if 153 is Armstrong number");

        String numTxt = "153";
        int mult=0;
        for(int i1=0;i1<numTxt.length();i1++) {
            System.out.println(numTxt.charAt(i1));
            if(i1==1) {
                mult=i1*i1*i1;
            }
            //mult+=mult;
            System.out.println(mult);
        }        
        


    }
}
