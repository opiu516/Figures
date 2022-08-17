import static org.junit.Assert.*;

import org.junit.Test;

public class TestCircleFactory {

	@Test
	public void createRandom_CreatesCircles() {
		assertEquals("Circle",new CircleFactory().createRandom().getClass().getName());
	}
	
	@Test
	public void createRandom_CreatesRandomCircles() {
		assertNotEquals(new CircleFactory().createRandom(),new CircleFactory().createRandom());
	}
	
	@Test
	public void createRandom_DoesNotReturnNull() {
		assertNotNull(new CircleFactory().createRandom());
	}
	
	@Test
	public void create_returnsCircle() {
		assertEquals("Circle",CircleFactory.create(1).getClass().getName());
	}
	
	@Test 
	public void create_DoesNotReturnNull() {
		assertNotNull(CircleFactory.create(2));
	}
}
