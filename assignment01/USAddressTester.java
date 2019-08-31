package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
public class USAddressTester {
	public static void main(String[] args) {
		StreetUSAddress AddressOne = new StreetUSAddress("20 Yolanda Drive", "", "Burnt Hills", "NY", "12027");
		StreetUSAddress AddressTwo = new StreetUSAddress("1035 VanVorst Road", "PO Box 4200", "Burnt Hills", "NY", "12027");
		System.out.println(AddressOne);
		System.out.println(AddressTwo);

		try(var output =new PrintWriter(new FileOutputStream(
			    new File("output.txt"), true /* true means append to file */))) {
			output.println("\nTESTS FOR StreetUSAddress.java:");

		//Copy all your lines above, add an extra "2" to every variable name
		// and replace every System.out.print or System.out.println
		// by output.print or output.println
		StreetUSAddress AddressOne2 = new StreetUSAddress("20 Yolanda Drive", "", "Burnt Hills", "NY", "12027");
		StreetUSAddress AddressTwo2 = new StreetUSAddress("1035 VanVorst Road ", "PO Box 4200", "Burnt Hills", "NY", "12027");
		output.println(AddressOne2);
		output.println(AddressTwo2);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
