import org.junit.Test;

public class TestRectangle {

	@Test
	public void perimeter_ReturnsValidData() {
		TestFigure.perimeter_ReturnsValidData(new Rectangle(2,3), 10);
	}
	
	@Test 
	public void toString_ReturnsValidData() {
		TestFigure.toString_ReturnsValidData(new Rectangle(1,3), "rectangle 1.0 3.0");
	}
	
	@Test
	public void clone_DoesNotReturnAnInstanceOfItself() {
		TestFigure.clone_DoesNotReturnAnInstanceOfItself(new Rectangle(1.0,2.0));
	}
	
	@Test
	public void clone_ReturnsObjectEqualToTheParent() throws Exception {
		TestFigure.clone_ReturnsObjectEqualToTheParent(new Rectangle(1.0,2.0));
	}
	
	
	@Test
	public void equals_ReturnsTrueForEqualRectangles() {
		TestFigure.equals_ReturnsTrueForEqualFigures(new Rectangle(1.0,1.0),new Rectangle(1.0,1.0));
	}
	
	@Test
	public void equals_ReturnsFalseForDifferentRectangles() {
		TestFigure.equals_ReturnsFalseForDifferentFigures(new Rectangle(1.0,1.0), new Rectangle(1.0,2.0));
	}
	
	@Test
	public void equals_ReturnsFalseForDifferentTypeFigures() {
		TestFigure.equals_ReturnsFalseForDifferentTypeFigures(new Rectangle(1.0,1.0), new Circle(1.0));
	}
}
