
public class InitArray {

	
	public static void main(String[] args) {
		
		int [][] array1 = {{1,2,3},{3,2,1},{0}};
		int [][] array2 = {{10,11,12},{20,21},{30,31,32,33},{40}};
		
		displayMatrix(array1);
		System.out.printf("This is the second matrix\n");
		displayMatrix(array2);
		
	}
	
	public static void displayMatrix (int [][] arrayReference) {
		for ( int row = 0; row < arrayReference.length; row++ ) {
			for ( int col = 0; col < arrayReference[row].length; col++) {
				System.out.printf("%d\t" , arrayReference[ row ][ col ]);
			}
			System.out.println();
		}
	}

}
