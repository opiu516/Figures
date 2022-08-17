
public class Rectangle extends Figure {
	
	private double side1;
	private double side2;
	
	public double getSide1() {
		return this.side1;
	}
	
	public double getSide2() {
		return this.side2;
	}
	
	public Rectangle(double side1, double side2) {
		this.side1 = side1;
		this.side2 = side2;
	}
	
	@Override
	public double perimeter() {
		return side1*2 + side2*2;
	}

	@Override
	public String toString() {
		return "rectangle " + this.side1 + " " + this.side2;
	}

	public Figure clone() {
		return RectangleFactory.create(this.side1,this.side2);
	}
	
	public boolean equals(Figure compared) {
		if(compared.getClass().getName() != "Rectangle") {
			return false;
		}
		if(this.side1 == ((Rectangle) compared).getSide1() && this.side2 == ((Rectangle) compared).getSide2()) {
			return true;
		} 
		return false;
	}

}
