package ifelse;

public class ifcondition5 {
	boolean checkleapyear(int year) {
		if(((year %4 ==0)&&(year %100 !=0))||(year %400 ==0)) {
			System.out.println("given year is leap year");
return true;
		}else {
			System.out.println("given year is not leap year");
			return false;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int year =2020;
if(((year %4 ==0)&&(year %100 !=0))||(year %400 ==0)) {
	System.out.println("given year is leap year");

}else {
	System.out.println("given year is not leap year");
	
}
ifcondition5 m1=new ifcondition5();
m1.checkleapyear(2022);
m1.checkleapyear(2024);
	}

}
