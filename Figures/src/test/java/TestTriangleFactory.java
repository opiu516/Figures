import static org.junit.Assert.*;

import org.junit.Test;

public class TestTriangleFactory {

	@Test
	public void createRandom_CreatesTriangles() {
		assertEquals("Triangle",new TriangleFactory().createRandom().getClass().getName());
	}
	
	@Test
	public void createRandom_CreatesRandomTriangles() {
		assertNotEquals(new TriangleFactory().createRandom(),new TriangleFactory().createRandom());
	}
	
	@Test
	public void createRandom_DoesNotReturnNull() {
		assertNotNull(new TriangleFactory().createRandom());
	}
	
	@Test
	public void create_returnsTriangle() {
		assertEquals("Triangle",TriangleFactory.create(1,1,1).getClass().getName());
	}
	
	@Test 
	public void create_DoesNotReturnNull() {
		assertNotNull(TriangleFactory.create(1,2,3));
	}

}
