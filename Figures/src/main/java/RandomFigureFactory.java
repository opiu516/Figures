

public class RandomFigureFactory implements FigureFactory{

	public Figure createTriangle() {
		return new TriangleFactory().createRandom();
	}

	public Figure createCircle() {
		return new CircleFactory().createRandom();
	}

	public Figure createRectangle() {
		return new RectangleFactory().createRandom();
	}
	
	public static Figure createRandomFigure() throws Exception {
		int pick = (int) Math.ceil(Math.random()*3);
		switch(pick){
			case 1: return new TriangleFactory().createRandom();
			case 2: return new CircleFactory().createRandom();
			case 3: return new RectangleFactory().createRandom();
			default: throw new Exception("Something went wrong");		
		}
		
	}
	
	public static Figure[] createMultipleRandomFigure(int number) throws Exception {
		Figure[] endResult = new Figure[number];
		
		for(int i = 0;i < number; i++) {
			endResult[i] = createRandomFigure();
		}
		
		return endResult;
	}

}
