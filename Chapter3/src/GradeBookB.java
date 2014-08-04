
public class GradeBookB {

	private String courseName;
	
	//constructor initializes courseName with String argument.  Constructor!!! must have the same name as the class.
	public GradeBookB( String name){
	
		courseName = name;  // initialze courseName
	
	}
	
	public void setCourseName( String name){
		
		courseName = name;
		
	}
	
	public String getCourseName(){
		
		return courseName;
		
	}
	
	public void displayMessage(){
		
		System.out.println("welc to the grade book for \n \n " + getCourseName() );
		
	}
}
