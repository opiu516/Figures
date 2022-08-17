import static org.junit.Assert.*;

import org.junit.Test;

public class TestRandomFigureFactory {

	
	@Test
	public void createTriangle_CreatesTriangle() {
		TestFigureFactory.createTriangle_CreatesTriangle(new RandomFigureFactory());
	}
	
	@Test
	public void createTriangle_DoesNotReturnNull() {
		TestFigureFactory.createTriangle_DoesNotReturnNull(new RandomFigureFactory());
	}
	
	@Test
	public void createCircle_CreatesTriangle() {
		TestFigureFactory.createCircle_CreatesTriangle(new RandomFigureFactory());
	}
	
	@Test
	public void createCircle_DoesNotReturnNull() {
		TestFigureFactory.createCircle_DoesNotReturnNull(new RandomFigureFactory());
	}
	
	@Test
	public void createRectangle_CreatesTriangle() {
		TestFigureFactory.createRectangle_CreatesTriangle(new RandomFigureFactory());
	}
	
	@Test
	public void createRectangle_DoesNotReturnNull() {
		TestFigureFactory.createRectangle_DoesNotReturnNull(new RandomFigureFactory());
	}
	
	@Test
	public void createRandomFigure_CreatesRandomFigure() throws Exception {
		assertNotEquals(RandomFigureFactory.createRandomFigure(),RandomFigureFactory.createRandomFigure());
	}
	
	@Test 
	public void createRandomFigure_DoesNotReturnNull() throws Exception{
		try {
		assertNotNull(RandomFigureFactory.createRandomFigure());
		}catch(Exception e) {
			
		}
	}

}
