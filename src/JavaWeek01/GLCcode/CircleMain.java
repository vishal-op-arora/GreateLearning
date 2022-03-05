package JavaWeek01.GLCcode;

/**
 * A Test Driver for the "Circle" class
 */
public class CircleMain {
	public static void main(String[] args) { // Program entry point
		
		System.out.println("Constructs a Circle instance with the given radius and color");
		Circle c1 = new Circle(2.0, "blue"); // Use 3rd constructor
		System.out.println("The radius is: " + c1.getRadius()); // use dot operator to invoke member methods
		// The radius is: 2.0
		System.out.println("The color is: " + c1.getColor());
		// The color is: blue
		System.out.printf("The area is: %.2f%n", c1.getArea());
		// The area is: 12.57

		System.out.println("\nConstructs a Circle instance with the given radius and default color");
		Circle c2 = new Circle(2.0); // Use 2nd constructor
		System.out.println("The radius is: " + c2.getRadius());
		// The radius is: 2.0
		System.out.println("The color is: " + c2.getColor());
		// The color is: red
		System.out.printf("The area is: %.2f%n", c2.getArea());
		// The area is: 12.57

		System.out.println("\nConstructs a Circle instance with default radius and color");
		Circle c3 = new Circle(); // Use 1st constructor
		System.out.println("The radius is: " + c3.getRadius());
		// The radius is: 1.0
		System.out.println("The color is: " + c3.getColor());
		// The color is: red
		System.out.printf("The area is: %.2f%n", c3.getArea());
		// The area is: 3.14
	}
}