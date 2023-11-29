package samplePgm;

public class Person {
	String name;
	int age;
	Address address;
	public void personDetails(String name,int age) {
		this.name=name;
		this.age=age;
	}

public void addressDetails(Address address) {
	this.address=address;

}
public  String displayname() {
	
	return name;
}
public int displayAge() {
	return age;
}
public  Address displayAddress() {
	
	return address;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p=new Person();
	p.personDetails("Anu", 10);
	System.out.println("name: "+p.displayname());
	System.out.println("age: "+p.displayAge());
	Address ad=new Address();
	
	ad.setHouseName("Malayil");	
	ad.setPinCode("123");
	ad.setStreetName("abc");
	p.addressDetails(ad);
	
	System.out.println("Address:"+p.displayAddress().getHouseName()+" ,"+p.displayAddress().getStreetName());

	}

}
