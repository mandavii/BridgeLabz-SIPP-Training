package ClassAndObjects;

 class Employee {
	private String name;
	private int id;
	private double salary;
	
	public Employee(String name, int id, double salary) {
		this.name = name;
		this.id = id;
		this.salary = salary;
		}



	public void displayDetails() {
	
		System.out.println("name " + name);
	
		System.out.println("id " + id);
	
		System.out.println("salary " + String.format("%.2f", salary)) ;
		}
	}

 public class EmployeeDetail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee employee1 = new Employee("alice", 101, 75000.50);
		
		employee1.displayDetails();
		
		Employee employee2 = new Employee("bob", 102, 82500.75);
		System.out.println("\n");
		employee2.displayDetails();
		
		
		
		
		
		
	}

}
