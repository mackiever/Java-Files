import java.util.Random;

public class TestingMyBS {
	private static final int THIS_IS_VARIABLE = 10;
	int[] myarray = { 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
	private static final Random myRandom = new Random();
	public void DisplayCurrentArray() {
		
		for (int i = 0; i < myarray.length; i++) {
			System.out.printf("%d\n", myarray[i]);
		}

	}

	public int DisplayNewArray() {
		
		for (int x = 0; x < myarray.length; x++) {
			int randomness = myRandom.nextInt(THIS_IS_VARIABLE);
			int temp = myarray[ 0 ];
			myarray[ 0 ] = myarray[ randomness ];
			myarray[ randomness ] = temp;
			//System.out.println("The current number is: " + myarray[x]);
		}
		System.out.println("new array begins here");
		for ( int y = 0; y < myarray.length; y++ ) {
			System.out.printf("%d\n" , myarray[y]);
		}
		return 0;
	}
}
