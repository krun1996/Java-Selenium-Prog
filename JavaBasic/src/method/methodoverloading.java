package method;

public class methodoverloading {
	public static void display() {
		System.out.println("no parameter method");
	}
	public static void display(int num) {
		int square=num*num;
		System.out.println("square of no. is: "+square);
	}
	public static void display(double num1,double num2) {
		double multiplication=num1*num2;
		System.out.println("multiplication of no. is : "+multiplication);
	}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
	methodoverloading.display();
	methodoverloading.display(7);
	methodoverloading.display(7,8);
		}


}
