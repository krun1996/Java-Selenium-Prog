package method;

public class method5 {
	public static double divtwonum(int a,int b) {
		return (a/b);
	}
	public double areacircle(int r,float pi) {
		return(pi*r*r);
	}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
	System.out.println("divison is: "+method5.divtwonum(12,8));
	method5 v1=new method5() ;
	System.out.println("area of circle is: "+v1.areacircle(24,3.14f));
		}

}
