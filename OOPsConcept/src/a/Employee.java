package a;

public class Employee {
	
	int id;
	String name;
	float salary;			// property or instance variable
	
	void setValue(int id1, String name1,float salary1) {
		id = id1;
		name = name1;
		salary=salary1;
		
	}
	
	void display() {			// behaviour or function 
		System.out.println("id is "+id);
		System.out.println("name is "+name);
		System.out.println("salary is "+salary);
	}

}
