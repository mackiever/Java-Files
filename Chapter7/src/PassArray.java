public class PassArray {

	public static void main(String[] args) {
		int [] myArray = {1,2,3,4,5,6,7,8,9,10};
		System.out.println("The current values of the array are: ");
		for (int n : myArray)
			System.out.printf("%d\n" , n);
		
		System.out.println("The effects of using modifyArray method");
		
		modifyArray(myArray);
		for ( int par : myArray )
			System.out.printf("%d\n" , par);
		
		System.out.printf("the effects of modifying element array[3] before modifyElement method: %d\n" , myArray[3]);
		
		System.out.println("The effects of modifying element array[3] after calling modifyElement method");
		modifyElement(myArray[3]);
		System.out.printf("the vlaue of array[3] after modifyElement: %d\n" , myArray[ 3 ]);
	}
	
	public static void modifyArray ( int [] a ){
		for (int y = 0; y < a.length; y ++)
			a[ y ] *= 2;
	}
	
	public static void modifyElement ( int parameter ){
		parameter *= 2;
		System.out.printf("the value of array[3] in modifyElement method: %d\n" , parameter);
	}
	

}
