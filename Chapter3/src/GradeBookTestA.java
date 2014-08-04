import java.util.Scanner;
public class GradeBookTestA {

	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		GradeBookA myGradeBook = new GradeBookA ();
		
		System.out.println("initial course name is: \n \n " + myGradeBook.getCourseName() );
		
		System.out.println("Enter course name: ");
		String theName = input.nextLine();
		myGradeBook.setCourseName(theName);
		myGradeBook.displayMessage();
		
	}

}
