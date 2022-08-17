import org.junit.Test;

public class TestTriangle {

	@Test
	public void perimeter_ReturnsValidData() {
		TestFigure.perimeter_ReturnsValidData(new Triangle(1.0,1.0,1.5), 3.5);
	}
	
	@Test 
	public void toString_ReturnsValidData() {
		TestFigure.toString_ReturnsValidData(new Triangle(1.0,1.0,1.5), "triangle 1.0 1.0 1.5");
	}
	
	@Test
	public void clone_DoesNotReturnAnInstanceOfItself() {
		TestFigure.clone_DoesNotReturnAnInstanceOfItself(new Triangle(1.0,2.0,3.0));
	}
	
	@Test
	public void clone_ReturnsObjectEqualToTheParent() throws Exception {
		TestFigure.clone_ReturnsObjectEqualToTheParent(new Triangle(1.0,2.0,3.0));
	}
	
	
	@Test
	public void equals_ReturnsTrueForEqualTriangles() {
		TestFigure.equals_ReturnsTrueForEqualFigures(new Triangle(1.0,2.0,3.0),new Triangle(1.0,2.0,3.0));
	}
	
	@Test
	public void equals_ReturnsFalseForDifferentRectangles() {
		TestFigure.equals_ReturnsFalseForDifferentFigures(new Triangle(1.0,2.0,3.0), new Triangle(1.0,1.0,1.0));
	}
	
	@Test
	public void equals_ReturnsFalseForDifferentTypeFigures() {
		TestFigure.equals_ReturnsFalseForDifferentTypeFigures(new Triangle(1.0,2.0,3.0), new Circle(1.0));
	}
}
