import java.util.Scanner;

public class CircleFactory implements SmallFactory{
	public Circle createRandom() {
		return new Circle(SupportStuff.getRandomNumberWith2Decimals());
	}
	
	public static Circle create(double radius) {
		return new Circle(radius);
	}

	public Figure StdinCreate(Scanner scanGuy) {
		double radius = scanGuy.nextDouble();
		return CircleFactory.create(radius);
	}
}
