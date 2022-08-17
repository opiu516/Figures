import java.util.Scanner;

public class RectangleFactory implements SmallFactory{
	public Rectangle createRandom() {
		return new Rectangle(
				SupportStuff.getRandomNumberWith2Decimals(),
				SupportStuff.getRandomNumberWith2Decimals()
				);
	}
	
	public static Rectangle create(double side1,double side2) {
		return new Rectangle(side1,side2);
	}


	public Figure StdinCreate(Scanner scanGuy) {
		double side1 = scanGuy.nextDouble();
		double side2 = scanGuy.nextDouble();
		return RectangleFactory.create(side1, side2);
	}
}
