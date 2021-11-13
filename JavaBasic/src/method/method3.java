package method;

public class method3 {
	static double x=12,y=20,z=30;
	public static double average() {
		return (x+y+z)/3;
	}
	public static double average(int a,int b, int c) {
	return (a+b+c)/3;
	}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
	System.out.println("first no. is: "+x);
	System.out.println("second  no. is: "+x);
	System.out.println("average is: "+method3.average());
	System.out.println("average2 is: "+method3.average(10,25,30));
	int p=20,q=30,r=40;
	System.out.println("average3 is: "+method3.average(p,q,r));
		}

}
