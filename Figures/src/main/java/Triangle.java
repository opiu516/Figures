
public class Triangle extends Figure{
	
	private double side1;
	private double side2;
	private double side3;
	
	public double getSide1() {
		return side1;
	}
	
	public double getSide2() {
		return side2;
	}
	
	public double getSide3() {
		return side3;
	}
	
	public Triangle(double side1, double side2, double side3){
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	
	@Override
	public double perimeter() {
		return this.side1 + this.side2 + this.side3;
	}

	@Override
	public String toString() {
		return "triangle " + this.side1 + " " + this.side2 +" " + this.side3;
	}

	public Figure clone(){
		return TriangleFactory.create(this.side1,this.side2,this.side3);
	}
	
	public boolean equals(Figure compared) {
		if(compared.getClass().getName() != "Triangle") {
			return false;
		}
		if(this.side1 == ((Triangle) compared).getSide1() &&
		   this.side2 == ((Triangle) compared).getSide2() &&
		   this.side3 == ((Triangle) compared).getSide3()) {
			return true;
		}
		return false;	
	}

}
