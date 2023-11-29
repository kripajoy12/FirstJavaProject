package samplePgm;

public class Result extends AdditionResult {
	public void getResult() {
		show(10,2);
		sumOfTwo();
	if(super.sum%10==0) {
		System.out.println("Divisible by 10");
	}else {
		System.out.println("Not Divisible");
	}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Result rs=new Result();
		rs.getResult();
	}

}
