package Unary_Operator;

public class Operator_3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 25, b;
		b = a++;
		int x = a, y;
		y = ++x;
		System.out.println("value of a: " + a);
		System.out.println("value of b: " + b);
		System.out.println("value of x: " + x);
		System.out.println("value of y: " + y);

		int p = 24, q = 34, res;
		res = p++ + --q;
		System.out.println("result is : " + res);

		int result = p-- + q++;
		System.out.println("result is : " + result);
	}

}
