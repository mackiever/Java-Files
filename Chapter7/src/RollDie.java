
// import Random class
import java.util.Random;
public class RollDie {

	public static void main(String[] args) {
		Random randomNumbers = new Random();
		int [ ] frequency = new int [ 7 ];
		// enter for loop and enter loop from 1 to 6000 times
		for ( int roll = 1; roll <= 6000; roll++ ) {
			
			frequency[ 1 + randomNumbers.nextInt( 6 ) ]++;  // die number from 1 to 6 will hold the index values of array frequency.
															//increase frequency by 1 to each of its values
		}
		System.out.printf("%s%10s\n" , "face" , "frequency");
		
		for ( int face = 1; face < frequency.length; face ++ ) {
			System.out.printf("%3d%10d\n" , face, frequency[ face ]);
		}
 
	}

}
