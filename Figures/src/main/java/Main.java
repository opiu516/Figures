import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	private static Scanner chooser = new Scanner(System.in);
	
	
	private static void CreateRandomFigures(ArrayList<Figure> items) throws Exception {
		System.out.println("How many random Figures would you want?");
		int choice = chooser.nextInt();
		Figure[] temp = RandomFigureFactory.createMultipleRandomFigure(choice);
		for(int i = 0; i < choice; i++) {
			items.add(temp[i]);
		}
	}
	
	private static void CreateFiguresFromInput(ArrayList<Figure> items) throws Exception {
		System.out.println("How many Figures would you want to enter?");
		int choice = chooser.nextInt();
		Figure[] toAdd = StreamFigureFactory.createMultipleFiguresFromStdin(choice);
		for(int i = 0; i < choice; i++) {
			items.add(toAdd[i]);
		}
	}
	
	private static void CreateFiguresFromFile(ArrayList<Figure> items) throws Exception {
		System.out.println("Which file from recources you want to work with");
		String fileName = chooser.next() + ".txt";
		if(!new File(System.getProperty("user.dir") + "/recources/" + fileName).exists()) {
			System.out.println("File not found!");
			return;
		}
		Figure[] toAdd = StreamFigureFactory.createAllFiguresFromSFile(fileName);
		for(int i = 0;i < toAdd.length;i++) {
			items.add(toAdd[i]);
		}
	}
	
	public static void main(String args[]) throws Exception {
		ArrayList<Figure> items = new ArrayList<Figure>();
		System.out.println("Hello, how would you like your figures?");
		System.out.println("1.Random");
		System.out.println("2.From Input");
		System.out.println("3.From File");
		int choice = chooser.nextInt();
		int lifeCycle = 1;
		switch(choice) {
			case 1: {
				Main.CreateRandomFigures(items);
				break;
			}
			case 2: {
				Main.CreateFiguresFromInput(items);
				break;
			}
			case 3: {
				Main.CreateFiguresFromFile(items);
				break;
			}
			default:{
				System.out.println("No such choice!");
				lifeCycle = 0;
			}
		}
		while(lifeCycle == 1) {
			System.out.println("Whats next?");
			System.out.println("1.Print to console");
			System.out.println("2.Delete a figure");
			System.out.println("3.Copy a figure");
			System.out.println("4.Store in a file");
			System.out.println("5.Close");
			choice = chooser.nextInt();
			switch(choice) {
			case 1: {
				Main.printToConsole(items);
				break;
			}
			case 2: {
				Main.deleteFigure(items);
				break;
			}
			case 3: {
				Main.copyFigure(items);
				break;
			}
			case 4: {
				Main.storeInFile(items);
				break;
			}
			case 5:{
				System.out.println("Goodbye!");
				lifeCycle = 0;
				break;
			}
			default:{
				System.out.println("No such choice!");
				lifeCycle = 0;
			}
		}
		}
	}

	private static void storeInFile(ArrayList<Figure> items) throws IOException {
		System.out.println("Name the file, it will be in recoursec folder");
		String fileName = chooser.next() + ".txt";
		File toWrite = new File(System.getProperty("user.dir") + "/recources/" + fileName);
		if(toWrite.createNewFile()) {
			System.out.println("File was created");
		}
		PrintWriter writer = new PrintWriter(toWrite);
		for(int i = 0;i < items.size();i++) {
			writer.println(items.get(i));		
		}
		writer.close();
	}

	private static void copyFigure(ArrayList<Figure> items) {
		System.out.println("Enter the index of the figure to copy.");
		int choice = chooser.nextInt();
		if(choice < 0 || choice >= items.size()) {
			System.out.println("Index out of bonds");
			return;
		}
		items.add(items.get(choice).clone());
	}

	private static void deleteFigure(ArrayList<Figure> items) {
		System.out.println("Enter the index of the deleted figure.");
		int choice = chooser.nextInt();
		if(choice < 0 || choice >= items.size()) {
			System.out.println("Index out of bonds");
			return;
		}
		items.remove(choice);
				
	}

	private static void printToConsole(ArrayList<Figure> items) {
		for(int i = 0;i < items.size();i++) {
			System.out.println(items.get(i));
		}
		
	}
}
