import java.util.Scanner;

public class TriangleFactory implements SmallFactory{
	public Triangle createRandom() {
		double side1 = SupportStuff.getRandomNumberWith2Decimals();
		double side2 =SupportStuff.getRandomNumberWith2Decimals();
		double side3 =SupportStuff.getRandomNumberWith2Decimals();
		return new Triangle(side1,side2,side3);
	}
	
	public static Triangle create(double side1,double side2,double side3) {
		return new Triangle(side1,side2,side3);
	}
	
	public Triangle StdinCreate(Scanner scanGuy) {
		double side1 = scanGuy.nextDouble();
		double side2 = scanGuy.nextDouble();
		double side3 = scanGuy.nextDouble();
		return TriangleFactory.create(side1, side2, side3);
	}
	
}
