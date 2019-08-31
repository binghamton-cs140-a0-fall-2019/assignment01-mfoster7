package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
public class ComputerTester {
	public static void main(String[] args) {
	//TODO make 4 different Computer objects with different
	//combinations of disk size (two more than a terabyte and two less)
	//and for each make one an SSD drive and the other not.
	//Then call System.out.println(comp); for each "comp" object
	//and observe that there are small differences in how the computer
	//information prints out.
    Computer testOne = new Computer("Windows", "Intel Core i5", 8, 400, true, 300);
		Computer testTwo = new Computer("Alienware", "Intel Core i7", 16, 800, false, 500);
		Computer testThree = new Computer("Dell", "Intel Core i6",32, 1500, true, 800);
		Computer testFour = new Computer("Lenovo", "Intel Xeon E5", 64, 3000, false, 1350);
		System.out.println(testOne);
		System.out.println(testTwo);
		System.out.println(testThree);
		System.out.println(testFour);
		try(var output =new PrintWriter(new FileOutputStream(
			    new File("output.txt"), true /* true means append to file */))) {
			output.println("\nTESTS FOR Computer.java:");

		//Copy all your lines above, add an extra "2" to every variable name
		// and replace every System.out.print or System.out.println
		// by output.print or output.println
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
