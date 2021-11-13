package loops;

public class forloop3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
for(int i=0;i<10;i++) {
	if(i%2==0) {
		System.out.println("***print"+i);
	}
	for(int j=0;j<20;j++) {
	j=j+4;
		System.out.println(j);
	}
}
	}

}
