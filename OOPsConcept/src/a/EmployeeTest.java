package a;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp1 = new Employee();
		Employee emp2 = new Employee();
		Employee emp3 = new Employee();
		Employee emp5 = new Employee(15,"Maria",475);
//		emp1.name = "Joe";
//		emp1.salary = 120000;
//		emp1.id = 12;
//		emp2.name = "Steven";
//		emp2.salary = 34555;;
//		emp2.id = 13;
		emp3.setValue(14, "Luke",18000);
		
		emp1.display();
		emp2.display();
		emp3.display();
		Employee emp4 = new Employee();
		emp4.display();
		emp5.display();
		
		

	}

}
