package JavaConstructors;

class Circle{
	private double radius;
	
	public Circle(){
		this(1.0);
		System.out.println("Default circle, radius 1.0");
	}
	
	
	public Circle(double radius) {
		
		if(radius >=0) {
			this.radius = radius;
		}
		else {
			this.radius = 0.0;
			System.out.println("negative radius?");
		}
		System.out.println("parameterized circle, radius- "+ String.format("%.2f", radius));
		
	}
	
	public void displayDetails() {
		System.out.println("radius " + String.format("%.2f", this.radius));
		
		
		System.out.println("Area " + String.format("%.2f", Math.PI* this.radius*this.radius));
	}
	
}






public class CircleClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		System.out.println("Circle using default ");
		Circle circle1 = new Circle();
		circle1.displayDetails();
		
		

		System.out.println("new Circle");
		Circle circle2 = new Circle(5.8);
		circle2.displayDetails();
	}

}
