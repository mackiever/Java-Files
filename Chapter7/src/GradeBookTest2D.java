
public class GradeBookTest2D {


	public static void main(String[] args) {
		
		int [][] gradesArray = { {87,96,70},
								{68, 87, 90},
								{94,100,90},
								{100,81,82},
								{83,65,85},
								{78,87,65},
								{85,75,83},
								{91,94,100},
								{76,72,84},
								{87,93,73}};
		
		GradeBook2D myGradeBook = new GradeBook2D("This is my string" , gradesArray);
		myGradeBook.displayMessage();
		myGradeBook.processGrades();

	}

}
