package method;

public class method2 {
	static int salary=45678;
	static int empid=789;
	public static int printsalary() {
		System.out.println("printsalary is :"+salary);
		return salary;
	}
	public static void printempid() {
	System.out.println("printempid is: "+empid);	
	}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
	int age=50;
	System.out.println("age is: "+age);
	System.out.println("empid is: "+method2.empid);
	System.out.println("salary is: "+method2.salary);
	method2.printsalary();
	method2.printempid();
		}
}
