import static org.junit.Assert.*;

import org.junit.Test;

public class TestRectangleFactory {

	@Test
	public void createRandom_CreatesTriangles() {
		assertEquals("Rectangle",new RectangleFactory().createRandom().getClass().getName());
	}
	
	@Test
	public void createRandom_CreatesRandomTriangles() {
		assertNotEquals(new RectangleFactory().createRandom(),new RectangleFactory().createRandom());
	}
	
	@Test
	public void createRandom_DoesNotReturnNull() {
		assertNotNull(new RectangleFactory().createRandom());
	}
	
	@Test
	public void create_returnsTriangle() {
		assertEquals("Rectangle",RectangleFactory.create(1,2).getClass().getName());
	}
	
	@Test 
	public void create_DoesNotReturnNull() {
		assertNotNull(RectangleFactory.create(1,3));
	}
}
