package ClassAndObjects;

class Student{
	private String name;
	private int rollNumber;
	private double marks;
	
	public Student(String name, int rollNumber, double marks) {
		this.name = name;
		this.rollNumber = rollNumber;
		this.marks = marks;
	}
	
	public String Grades() {
		if(marks>=90) {
			return "A";
		} else if(marks >= 80) {
			return "B";
		} else if(marks >=70) {
			return "C";
		} else if(marks>=60) {
			return "D";
		}else {
			return "F";
		}
	}
	
	
	
	
	
	public void displayDetails() {
		System.out.println("name" + name);
		System.out.println("rollNo."+ rollNumber);
		System.out.println("marks"+ String.format("%.2f", marks));
		System.out.println("grade"+ Grades());
	}

}



public class StudentReport {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student student1 = new Student("Krish", 21, 92.87);
		student1.displayDetails();

		System.out.println();
		
		
	}

}
