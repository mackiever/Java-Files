
public class GradeBookA {

	private String courseName;  // set instance variable used by other constructors within the same class.
	
	public void setCourseName( String name){ // void will not return anything and only set string name
	
		courseName = name;  // stores course name
	
	}
	
	public String getCourseName(){ // method to retrieve the course name
		
		return courseName;
		
	}
	
	public void displayMessage(){
		
		System.out.println("welc to the grade book for \n \n " + getCourseName() );
		
	}
}
