package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
public class ComputerOwnerTester {
	public static void main(String[] args) {
		DateAndPlaceOfBirth compPDOB = new DateAndPlaceOfBirth(2000, 12, 24, "Albany", "NY");
		StreetUSAddress compAddress = new StreetUSAddress("40 Shadick Road", "", "Charlton", "NY", "12027");
		Person compPerson = new Person("Danielle", "Morrow", "742061289", compPDOB, compAddress);
		ComputerOwner ownerTest = new ComputerOwner(compPerson);
		Computer compOne = new Computer("Windows", "Intel Core i5", 8, 400, true, 300);
		Computer compTwo = new Computer("Alienware", "Intel Core i7", 16, 800, false, 500);
		Computer compThree = new Computer("Dell", "Intel Core i6",32, 1500, true, 800);
		Computer compFour = new Computer("Lenovo", "Intel Xeon E5", 64, 3000, false, 1350);
		ownerTest.addComputer(compOne);
		ownerTest.addComputer(compTwo);
		ownerTest.addComputer(compThree);
		ownerTest.addComputer(compFour);
		System.out.println(ownerTest);

		try(var output =new PrintWriter(new FileOutputStream(
			    new File("output.txt"), true /* true means append to file */))) {
			output.println("\nTESTS FOR ComputerOwner.java:");

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
