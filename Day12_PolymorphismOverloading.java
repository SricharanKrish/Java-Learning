
public class Day12_PolymorphismOverloading {

	//polymorphism is implemented through OVERLOADING
	// same method but different params
	int a =10, b=20;

	void sum() {
		System.out.println(a+b);
	}

	void sum(int x, int y) {
		System.out.println(x+y);
	}

	void sum(double x, double y){
		System.out.println(x+y);
	}

	public static void main(String[] args) {

		Day12_PolymorphismOverloading m = new Day12_PolymorphismOverloading();

		m.sum(18.981, 516.1134);

	}

}
