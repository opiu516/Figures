import static org.junit.Assert.*;

public class TestFigure {

	public static void perimeter_ReturnsValidData(Figure operator,double expected) {
		assertEquals(operator.perimeter(),expected,0.0001);
	}
	
	public static void toString_ReturnsValidData(Figure operator,String expected) {
		assertEquals(operator.toString(),expected);
	}
	
	public static void clone_DoesNotReturnAnInstanceOfItself(Figure operator) {
		assertNotSame(operator.clone(),operator);
	}
	
	public static void clone_ReturnsObjectEqualToTheParent(Figure operator) {
		assertTrue(operator.equals(operator.clone()));
	}
	
	public static void equals_ReturnsTrueForEqualFigures(Figure operator1,Figure operator2) {
		assertTrue(operator1.equals(operator2));
	}
	
	public static void equals_ReturnsFalseForDifferentFigures(Figure operator1,Figure operator2) {
		assertFalse(operator1.equals(operator2));
	}
	
	public static void equals_ReturnsFalseForDifferentTypeFigures(Figure operator1,Figure operator2) {
		assertFalse(operator1.equals(operator2));
	}
}
