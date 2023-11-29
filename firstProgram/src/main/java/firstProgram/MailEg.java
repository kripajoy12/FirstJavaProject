package firstProgram;

public class MailEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PermanentEmployee pe=new PermanentEmployee();
		pe.setValue("anu", 1230);
		pe.display();
		pe.setSalary(2000);
		System.out.println("Salary :"+pe.calculateSalary());
		ContractEmployee ce=new ContractEmployee();
		ce.setValue("Arya", 654);
		ce.display();		
		ce.setSalar(1000);
		System.out.println("Sal: "+ce.calculatSalary());

	}

}
