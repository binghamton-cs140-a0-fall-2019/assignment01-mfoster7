package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
public class PersonTester {
  public static void main(String[] args) {
    DateAndPlaceOfBirth testPDOB = new DateAndPlaceOfBirth(2001, 8, 17, "Schenectady", "NY");
    StreetUSAddress testAddress = new StreetUSAddress("88 Lakehill Road", "", "Burnt Hills", "NY", "12027");
    Person testPerson = new Person("Paul", "Fedoroff", "000000004", testPDOB, testAddress);
    System.out.println(testPerson);

    try(var output =new PrintWriter(new FileOutputStream(
          new File("output.txt"), true /* true means append to file */))) {
      output.println("\nTESTS FOR Person.java:");

    //Copy all your lines above, add an extra "2" to every variable name
    // and replace every System.out.print or System.out.println
    // by output.print or output.println
    DateAndPlaceOfBirth testPDOB2 = new DateAndPlaceOfBirth(2001, 8, 17, "Schenectady", "NY");
    StreetUSAddress testAddress2 = new StreetUSAddress("88 Lakehill Road", "", "Burnt Hills", "NY", "12027");
    Person testPerson2 = new Person("Paul", "Fedoroff", "000000004", testPDOB2, testAddress2);
    output.println(testPerson2);

    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }
  }
}
