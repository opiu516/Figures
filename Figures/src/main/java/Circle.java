
public class Circle extends Figure{
	
	private double radius;
	
	public double getRadius() {
		return this.radius;
	}
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	@Override
	public double perimeter() {
		return 2*radius*Math.PI;
	}

	@Override
	public String toString() {
		return "circle " + this.radius;
	}

	public Figure clone() {
		return CircleFactory.create(this.radius);
	}

	public boolean equals(Figure compared) {
		if(compared.getClass().getName() != "Circle") {
			return false;
		}
		if(this.radius == ((Circle) compared).getRadius()) {
			return true;
		}
		return false;
	}

}
