
public class deletz {
	int[] myarray;
	String myStringVariable;
	deletz(int[] a, String name){
		myarray = a;
		myStringVariable = name;
	}
	
	public void setName(String name){
		myStringVariable = name;
	}
	
	public String getName(){
		return myStringVariable;
	}
	
	public int getAverage(){
		int total = 0;
		int counter = 0;
		for (int myvar : myarray){
			counter ++;
			total += myvar;
		}
		int average = total / counter;
		System.out.println("the average is " + average);
		return total;
	}
}
