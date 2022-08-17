import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class StreamFigureFactory implements FigureFactory {

	public Figure createTriangle() {
		return null;
	}

	public Figure createCircle() {
		return null;
	}

	public Figure createRectangle() {
		return null;
	}
	
	@SuppressWarnings("deprecation")
	public static Figure createFigureWithScanner(Scanner scanGuy) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		String figureType = scanGuy.next();
		figureType = figureType.substring(0,1).toUpperCase() + figureType.substring(1).toLowerCase();
		String className = figureType + "Factory";
		Class<?> factory = Class.forName(className);
		if( ! SmallFactory.class.isAssignableFrom(factory)) {
			throw new IllegalArgumentException("Class " + className + " exists but does not implement Figure");
		}
		SmallFactory k = (SmallFactory) factory.newInstance();
		return k.StdinCreate(scanGuy);
	}
	
	public static Figure createFigureFromStdin() throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		return StreamFigureFactory.createFigureWithScanner(new Scanner(System.in));
	}
	
	public static Figure createFigureFromFile(String FileName) throws ClassNotFoundException, InstantiationException, IllegalAccessException, FileNotFoundException {
		File src = new File(System.getProperty("user.dir") + "/recources/" + FileName);
		return createFigureWithScanner(new Scanner(src));
	}
	
	public static Figure[] createMultipleFiguresFromStdin(int number) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		Figure[] returnValue = new Figure[number];
		Scanner scanGuy = new Scanner(System.in);
		for(int i = 0; i < number;i++) {
			returnValue[i] = StreamFigureFactory.createFigureWithScanner(scanGuy);
		}
		return returnValue;
	}
	
	public static Figure[] createMultipleFiguresFromSFile(int number, String FileName) throws ClassNotFoundException, InstantiationException, IllegalAccessException, FileNotFoundException {
		Figure[] returnValue = new Figure[number];
		File src = new File(System.getProperty("user.dir") + "/recources/" + FileName);
		Scanner scanGuy = new Scanner(src);
		for(int i = 0; i < number;i++) {
			returnValue[i] = StreamFigureFactory.createFigureWithScanner(scanGuy);
		}
		return returnValue;
	}
	
	public static Figure[] createAllFiguresFromSFile( String FileName) throws ClassNotFoundException, InstantiationException, IllegalAccessException, FileNotFoundException {
		ArrayList<Figure> returnValue = new ArrayList<Figure>();
		File src = new File(System.getProperty("user.dir") + "/recources/" + FileName);
		Scanner scanGuy = new Scanner(src);
		while(scanGuy.hasNext()) {
			returnValue.add(StreamFigureFactory.createFigureWithScanner(scanGuy));
		}
		Figure[] endResult = new Figure[returnValue.size()];
		for(int i = 0;i < returnValue.size();i++)
			endResult[i] = returnValue.get(i);
		return endResult;
	}
}
