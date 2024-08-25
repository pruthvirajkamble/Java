import java.util.Scanner;

public class ComputeTheVolumeOfCylinder {
	public static void main(String[] args) {
		// Create a Scanner object
		Scanner input = new Scanner(System.in);
		final double PI = 3.14159265359;

		// Prompt user to enter the radius and length of a cylinder
		System.out.print("Enter the radius and length of a cylinder: ");
		double radius = input.nextDouble();
		double length = input.nextDouble();

		// Comput the area and volume 
		double area = radius * radius * PI;
		double volume = area * length;

		// Display results
		System.out.println("The area is " + area);
		System.out.println("The volume is " + volume);
	}
}