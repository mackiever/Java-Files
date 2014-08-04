
public class GradeBookTestB {
	
	public static void main (String[] args){
		
		GradeBookB gradeBook1 = new GradeBookB("cs101 intro to java prog.");
		GradeBookB gradeBook2 = new GradeBookB("cs 102 Data Struc in Java");
				
		System.out.printf("gradeBook1 course name is: %s\n" , gradeBook1.getCourseName() );
		System.out.printf("gradeBook2 course name is: %s\n" , gradeBook2.getCourseName() );
		
		
	}

}
