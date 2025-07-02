package JavaConstructors;

class Person{ 
	private String name;
	private int age;
	private String email;
	
	public Person(String name, int age, String email){
		this.name = name;
		this.age = age;
		this.email = email;
		System.out.println("Regular Constructor" + name);
	}
	
	
	
	public Person(Person otherPerson) {
		this.name = otherPerson.name;
		this.age = otherPerson.age;
		this.email = otherPerson.email;
		System.out.println("other Person Constructor");
		
	}
	
	public void displayDetails() {
		System.out.println("Name"+name);
		System.out.println("Age"+ age);
		System.out.println("email"+email);

		
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age= age;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
}




public class PersonClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Person originalPerson = new Person("Alice Smith", 30, "alice@gmai.com");
		System.out.println("Detail of original Person");
		originalPerson.displayDetails();
		
		
		Person copiedPerson = new Person(originalPerson);
		System.out.println("detial of copied person(intital state)");
		copiedPerson.displayDetails();
		
		originalPerson.setName("Alex");
		originalPerson.setAge(33);
		originalPerson.setEmail("alex@gmail.com");
		
		System.out.println("original person (after modification)");
		originalPerson.displayDetails();
		System.out.println("copied  person (after modification)");
		copiedPerson.displayDetails();

	}

}
