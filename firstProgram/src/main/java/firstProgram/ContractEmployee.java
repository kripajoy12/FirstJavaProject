package firstProgram;

public class ContractEmployee extends Employee {
	long salary;
	public void setSalar(long salary) {
		this.salary=salary;
	
	}
	public long calculatSalary() {
		salary=salary*100;
		return salary;
	}

}
