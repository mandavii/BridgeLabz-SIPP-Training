package ClassAndObjects;

class Circle{
	private double radius;
	public Circle(double radius) {
		this.radius = radius;
	}
	
	public double calculateArea() {
		return Math.PI * radius*radius;
	}
	
	public double CalculateCircumference() {
		return 2* Math.PI *radius;
	}
	
	public void displayDetails() {
		System.out.println("radius" + radius);
		System.out.println("area" + String.format("%.2f", calculateArea()));
		System.out.println("Circumference" + String.format("%.2f", CalculateCircumference()));
	}
}


public class AreaOfCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Circle circle1 = new Circle(5.0);
		circle1.displayDetails();
		
		System.out.println();
		
		Circle circle2 = new Circle(10.0);
		circle2.displayDetails();
		
		System.out.println();
	}

}
