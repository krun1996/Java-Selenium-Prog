package ifelse;

public class ifcondition3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int marks=30;
if(marks<35) {
	System.out.println("student is fail");
}else if(marks>=35 && marks<50) {
	System.out.println("passed with D grade");
}else if(marks>=50 && marks<60) {
	System.out.println("passed with C grade");
}else if(marks>=60 && marks<70) {
	System.out.println("paseed with B grade");
}else if(marks>=70 && marks<80) {
	System.out.println("passed with A grade");
}else if(marks>=80 && marks<100) {
	System.out.println("passed with distingustion");
}else {
	System.out.println("invalid");
}
	}

}
