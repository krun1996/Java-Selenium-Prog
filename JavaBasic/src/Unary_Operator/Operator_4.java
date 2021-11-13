package Unary_Operator;

public class Operator_4 {
	public static void main(String[] args) {

		int a = 0, b;
		b = ++a + a++ + a + a++ + a;
		System.out.println("value of a is: " + a);
		System.out.println("value of b is: " + b);

		a = 0;
		b = a-- + --a + --a + a-- + a;
		System.out.println("value of a is: " + a);
		System.out.println("value of b is: " + b);

		a = 0;
		b = ++a + a-- + a + ++a + --a + a-- + a;
		System.out.println("value of a is: " + a);
		System.out.println("value of b is: " + b);
	}

}
