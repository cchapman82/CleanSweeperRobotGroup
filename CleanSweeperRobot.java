import java.io.*;
import java.util.Scanner;


public class CleanSweeperRobot {

	public static Cell[][] house = new Cell[10][10];
	
	public static void main(String[] args) {
		
		System.out.println("Welcome to Group7's Clean Sweeper Robot!");

		System.out.println("Please enter file to read room from.");
		Scanner in = new Scanner(System.in);
		String name = in.next();
		System.out.println(name);

		ConfigMngr configMngr = new ConfigMngr(name);
	}
}
