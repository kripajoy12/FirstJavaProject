package firstProgram;

public class PermanentEmployee extends Employee{
	double salary;
	public void setSalary(double salary) {
		this.salary=salary;
	
	}
	public double  calculateSalary() {
		salary=salary*2;
		return salary;
	}

}


