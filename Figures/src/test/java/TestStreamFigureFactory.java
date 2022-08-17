import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Scanner;

import org.junit.Assert;
import org.junit.Test;

public class TestStreamFigureFactory {
	
	public void InputOutputClassValidationStdin(String input,String output) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		String log = input;
	    InputStream in = new ByteArrayInputStream(log.getBytes());
	    System.setIn(in);
	    
	    Scanner scanGuy = new Scanner(System.in);
	    assertEquals(StreamFigureFactory.createFigureWithScanner(scanGuy).getClass().getSimpleName(),output);
	}
	
	public void InputOutputInfoValidationStdin(String input,String output) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		String log = input;
	    InputStream in = new ByteArrayInputStream(log.getBytes());
	    System.setIn(in);
	    
	    Scanner scanGuy = new Scanner(System.in);
	    assertEquals(StreamFigureFactory.createFigureWithScanner(scanGuy).toString(),output);
	}
	@Test
	public void CreateFigureWithScanner_CreatesTriangles() throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		InputOutputClassValidationStdin("triangle 1 1 1","Triangle");
	}
	
	@Test
	public void CreateFigureWithScanner_CreatesCircles() throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		InputOutputClassValidationStdin("circle 1","Circle");
	}
	
	@Test
	public void CreateFigureWithScanner_CreatesRectangles() throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		InputOutputClassValidationStdin("Rectangle 1 2","Rectangle");
	}
	
	@Test
	public void CreateFigureWithScanner_CreatesWantedCircles() throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		InputOutputInfoValidationStdin("circle 1","circle 1.0");
	}
	
	@Test
	public void CreateFigureWithScanner_CreatesWantedRectangles() throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		InputOutputInfoValidationStdin("rectangle 2 1","rectangle 2.0 1.0");
	}
	
	
	@Test
	public void CreateFigureWithScanner_CreatesWantedTriangles() throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		InputOutputInfoValidationStdin("triangle 1 1 1","triangle 1.0 1.0 1.0");
	}
	
	@Test
	public void CreateFigureWithScanner_ThrowsExceptionForInvalidFigureType() {
		try {
			InputOutputClassValidationStdin("rib 1","");
		}
		catch(Exception e) {
			return;
		}
		Assert.fail();
	}
	
	@Test
	public void CreateFigureFromFile_CreatesValidFigureFromFileExample() throws ClassNotFoundException, InstantiationException, IllegalAccessException, FileNotFoundException {
		assertEquals(StreamFigureFactory.createFigureFromFile("example.txt").toString(),"triangle 1.0 2.0 3.0");
	}
	
	@Test
	public void CreateFigureFromStdin_CreatesValidFigureFromInput() throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		String log = "circle 1";
	    InputStream in = new ByteArrayInputStream(log.getBytes());
	    System.setIn(in);
	    
	    assertEquals(StreamFigureFactory.createFigureFromStdin().toString(),"circle 1.0");
	}
	
	@Test
	public void createMultipleFiguresFromStdin_ReturnsArrayOfValidFigures() throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		String log = "circle 1 triangle 1 2 3";
	    InputStream in = new ByteArrayInputStream(log.getBytes());
	    System.setIn(in);
		
		Figure[] operator = StreamFigureFactory.createMultipleFiguresFromStdin(2);
		assertEquals(operator[0].toString(),"circle 1.0");
		assertEquals(operator[1].toString(),"triangle 1.0 2.0 3.0");
	}
	
	@Test
	public void createMultipleFiguresFromSFile_RetturnsArrayOfValidFiguresFromExampleFile() throws ClassNotFoundException, InstantiationException, IllegalAccessException, FileNotFoundException {
		Figure[] operator = StreamFigureFactory.createMultipleFiguresFromSFile(2,"example.txt");
		
		assertEquals(operator[0].toString(),"triangle 1.0 2.0 3.0");
		assertEquals(operator[1].toString(),"circle 1.0");	
	}
	
	@Test
	public void createAllFiguresFromSFile_RetturnsArrayOfAllValidFiguresFromExampleFile() throws ClassNotFoundException, InstantiationException, IllegalAccessException, FileNotFoundException {
		Figure[] operator = StreamFigureFactory.createAllFiguresFromSFile("example.txt");
		
		assertEquals(operator[0].toString(),"triangle 1.0 2.0 3.0");
		assertEquals(operator[1].toString(),"circle 1.0");	
		assertEquals(operator[2].toString(),"rectangle 1.0 2.0");	
	}

}
