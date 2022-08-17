import org.junit.Test;

public class TestCircle {

	@Test
	public void perimeter_ReturnsValidData() {
		TestFigure.perimeter_ReturnsValidData(new Circle(2), 12.5663);
	}
	
	@Test 
	public void toString_ReturnsValidData() {
		TestFigure.toString_ReturnsValidData(new Circle(3), "circle 3.0");
	}
	
	@Test
	public void clone_DoesNotReturnAnInstanceOfItself() {
		TestFigure.clone_DoesNotReturnAnInstanceOfItself(new Circle(3));
	}
	
	@Test
	public void clone_ReturnsObjectEqualToTheParent() throws Exception {
		TestFigure.clone_ReturnsObjectEqualToTheParent(new Circle(3));
	}
	
	
	@Test
	public void equals_ReturnsTrueForEqualRectangles() {
		TestFigure.equals_ReturnsTrueForEqualFigures(new Circle(3),new Circle(3));
	}
	
	@Test
	public void equals_ReturnsFalseForDifferentRectangles() {
		TestFigure.equals_ReturnsFalseForDifferentFigures(new Circle(3), new Circle(4));
	}
	
	@Test
	public void equals_ReturnsFalseForDifferentTypeFigures() {
		TestFigure.equals_ReturnsFalseForDifferentTypeFigures(new Circle(4),new Rectangle(1.0,1.0));
	}

}
