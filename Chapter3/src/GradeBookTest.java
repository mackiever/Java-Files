import java.util.Scanner;

public class GradeBookTest {

	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		GradeBook myGradeBook = new GradeBook();
		
		System.out.println("Please enter coursename: ");
		String nameOfCourse = input.nextLine();
		System.out.println();
		
		myGradeBook.displayMessage(nameOfCourse);
		
	}
	
}
