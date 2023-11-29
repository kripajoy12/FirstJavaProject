package firstProgram;

public class Employee {
	String name;
	int id;
	public void setValue(String name,int id) {
		this.name=name;
		this.id=id;
		
	}
	public void display() {
		System.out.println("Name: "+name);
		System.out.println("Id: "+id);
	}
	}
