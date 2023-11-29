package samplePgm;

public class AdditionResult {
	int a,b;
	int sum;
	public int show(int a,int b) {
		this.a=a;
		this.b=b;
		System.out.println("a: "+a);
		System.out.println("b: "+b);
		return a+b;
	}
	public int sumOfTwo() {
		sum=a+b;
		System.out.println("Sum= "+sum);
		return sum;
	}

}
