package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
public class SimpleDateTester{
	public static void main(String[] args) {
        SimpleDate sdOne = SimpleDate.of(2019, 7, 6);
        SimpleDate sdTwo = SimpleDate.of(2000, 4, 2);
        SimpleDate sdThree = SimpleDate.of(2019, 1, 17);
        SimpleDate sdFour = SimpleDate.of(2018, 8, 13);
        System.out.println(sdOne.before(sdTwo)); //should return false
        System.out.println(sdTwo.before(sdOne)); //should return true
        System.out.println(sdOne.before(sdThree)); //should return false
        System.out.println(sdThree.before(sdOne)); //should return true
        System.out.println(sdOne.before(sdFour)); //should return false
        System.out.println(sdFour.before(sdOne)); //should return true

		try(var output =new PrintWriter(new FileOutputStream(
			    new File("output.txt"), true /* true means append to file */))) {
			output.println("\nTESTS FOR SimpleDate.java:");

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
