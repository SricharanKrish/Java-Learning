public class Day13_Encapsulation {
    
// should not access variables through obj, instead we access them through methods. Its called Encapsulation.

// rules
// all variables should be private
// for every variable there should be 2 methods - get and set
// variables should only be operated through methods 

private int accno;
private String name;
private double amount;

 // for each variable we have to create getters and setters

    public int getAccno() {
        return accno;
    }

    public void setAccno(int accno) {
        this.accno = accno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public static void main(String[] args) {
        Day13_Encapsulation en = new Day13_Encapsulation();
        en.accno=1981;
        System.out.println(en.accno);

    }

    
    
    
}
