import java.util.Scanner;

public class GradeBookA {

	private String courseName;
	
	public GradeBookA(String name){ // create constructor that doesn't return anything. constructors never return anything.
		
		courseName = name;
		
	}
	
	public void setCourseName(String name){  // doesnt return any values and only sets courseName equal to name
		
		courseName = name;
		
	}
	
	public String getCourseName(){
		
		return courseName;
		
	}
	
	public void displayMessage(){
		
		System.out.println("welc to grade book for \n\n" + getCourseName() );
		
	}
	
	public void determineClassAverage(){
		
		Scanner input = new Scanner(System.in);
		int total = 0; int grade; double average; int gradeCounter = 0;
		
		System.out.println("plese enter grade or -1 to exit");
		grade = input.nextInt();
		
		while (grade != -1){
			
			total = total + grade;
			gradeCounter = gradeCounter + 1;
			
			System.out.println("enter grade or -1 to exit");
			grade = input.nextInt();
			
		}
		
		if (gradeCounter !=0 ){
			
			average = (double) total / gradeCounter;
			
			System.out.println("\n total of the  " + gradeCounter + "  grades entered is: \n " + total);
			
			System.out.println("class average is : \n" + average);
			
		}
		
		else
			
			System.out.println("No grades were entered");
			
		
	}
	
}
