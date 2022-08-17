import static org.junit.Assert.*;

public class TestFigureFactory {

	public static void createTriangle_CreatesTriangle(FigureFactory operator) {
		assertEquals("Triangle",operator.createTriangle().getClass().getName());
	}
	
	public static void createTriangle_DoesNotReturnNull(FigureFactory operator) {
		assertNotNull(operator.createTriangle());
	}
	
	public static void createCircle_CreatesTriangle(FigureFactory operator) {
		assertEquals("Circle",operator.createCircle().getClass().getName());
	}
	
	public static void createCircle_DoesNotReturnNull(FigureFactory operator) {
		assertNotNull(operator.createCircle());
	}
	
	public static void createRectangle_CreatesTriangle(FigureFactory operator) {
		assertEquals("Rectangle",operator.createRectangle().getClass().getName());
	}
	
	public static void createRectangle_DoesNotReturnNull(FigureFactory operator) {
		assertNotNull(operator.createRectangle());
	}

}
