
public class Testing {
	
	public int my_course; // instance variable
	public void Testing(int course){ //Testing constructor
		my_course = course;
	}
	
	public void setName(int name){
		my_course = name;
	}
	public int getName(){
		return my_course;
	}
	
	public void myMessage(int numb){
		System.out.printf("Hello mofo, your favorite number is: %s ", getName() );
	}
	
}
