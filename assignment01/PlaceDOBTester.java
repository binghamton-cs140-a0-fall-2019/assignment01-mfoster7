package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
public class PlaceDOBTester {
	public static void main(String[] args) {
    DateAndPlaceOfBirth PDOBone = new DateAndPlaceOfBirth(2000, 4, 2, "Troy", "NY" );
    DateAndPlaceOfBirth PDOBtwo = new DateAndPlaceOfBirth(2000, 4, 2, "Schenectady", "NY");
    DateAndPlaceOfBirth PDOBthree = new DateAndPlaceOfBirth(1989, 4, 2, "Orlando", "FL");
    DateAndPlaceOfBirth PDOBfour = new DateAndPlaceOfBirth(1883, 7, 28, "Predappio", "Italy");
    DateAndPlaceOfBirth PDOBfive = new DateAndPlaceOfBirth(1946, 6, 14, "Moscow", "Russia");
    System.out.println(PDOBone);
    System.out.println(PDOBtwo);
    System.out.println(PDOBthree);
    System.out.println(PDOBfour);
    System.out.println(PDOBfive);
    System.out.println(PDOBone.hasSameBirthDayAs(PDOBtwo)); //Should return true
    System.out.println(PDOBtwo.hasSameBirthDayAs(PDOBfour)); //Should return false
    System.out.println(PDOBone.hasSameBirthDayAs(PDOBthree)); //Should return true
    System.out.println(PDOBfour.olderThan(PDOBfive)); //Should return true
    System.out.println(PDOBone.olderThan(PDOBthree)); //Should return false
    System.out.println(PDOBthree.youngerThan(PDOBfive)); //Should return true
    System.out.println(PDOBfour.youngerThan(PDOBtwo)); //Should return false
    System.out.println(PDOBone.hasSameBirthDateAs(PDOBtwo)); //Should return true
    System.out.println(PDOBfour.hasSameBirthDateAs(PDOBfive)); //Should return false

    try(var output =new PrintWriter(new FileOutputStream(
          new File("output.txt"), true /* true means append to file */))) {
      output.println("\nTESTS FOR DateAndPlaceOfBirth.java:");

    //Copy all your lines above, add an extra "2" to every variable name
    // and replace every System.out.print or System.out.println
    // by output.print or output.println
    DateAndPlaceOfBirth PDOBone2 = new DateAndPlaceOfBirth(2000, 4, 2, "Troy", "NY" );
    DateAndPlaceOfBirth PDOBtwo2 = new DateAndPlaceOfBirth(2000, 4, 2, "Schenectady", "NY");
    DateAndPlaceOfBirth PDOBthree2 = new DateAndPlaceOfBirth(1989, 4, 2, "Orlando", "FL");
    DateAndPlaceOfBirth PDOBfour2 = new DateAndPlaceOfBirth(1883, 7, 28, "Predappio", "Italy");
    DateAndPlaceOfBirth PDOBfive2 = new DateAndPlaceOfBirth(1946, 6, 14, "Moscow", "Russia");
    output.println(PDOBone2);
    output.println(PDOBtwo2);
    output.println(PDOBthree2);
    output.println(PDOBfour2);
    output.println(PDOBfive2);
    output.println(PDOBone2.hasSameBirthDayAs(PDOBtwo2)); //Should return true
    output.println(PDOBtwo2.hasSameBirthDayAs(PDOBfour2)); //Should return false
    output.println(PDOBone2.hasSameBirthDayAs(PDOBthree2)); //Should return true
    output.println(PDOBfour2.olderThan(PDOBfive2));//Should return true
    output.println(PDOBone2.olderThan(PDOBthree2)); //Should return false
    output.println(PDOBthree2.youngerThan(PDOBfive2)); //Should return true
    output.println(PDOBfour2.youngerThan(PDOBtwo2)); //Should return false
    output.println(PDOBone2.hasSameBirthDateAs(PDOBtwo2)); //Should return true
    output.println(PDOBfour2.hasSameBirthDateAs(PDOBfive2)); //Should return false

    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }
  }
}
