
public class GradeBookTest {
	
	public static void main (String[] args){
		
		GradeBook myGradeBook = new GradeBook(
				"CS101 introduction to programming");
		
		myGradeBook.displayMessage();
		myGradeBook.inputGrade();
		myGradeBook.displayGradeReport();
		
	}

}
