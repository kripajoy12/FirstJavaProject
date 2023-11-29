package samplePgm;

public class ThisEg {
	int a,b;
	int sum;
public  void display(int a,int b) {
	this.a=this.b;
	 sum=a+b;
}
public void show() {
	display(10, 20);
	System.out.println("Sum "+sum);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
ThisEg th=new ThisEg();
th.show();
}

}
