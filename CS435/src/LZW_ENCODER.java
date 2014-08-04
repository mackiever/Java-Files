import java.util.*;
import java.util.Scanner;

//import javax.lang.model.type.ArrayType;

public class LZW_ENCODER {

	static int q = 256, w = 5;

	public int[][] populateNumbers(int[][] n, int row, int col) {
		Random newRandom = new Random();
		n = new int[row][col];
		for (int i = 0; i < n.length; i++) {
			n[i][0] = i;
			n[i][1] = newRandom.nextInt(100);
			System.out.println(n[i][0] + ", " + n[i][1]);

			//

		}

		return n;

	}

	public void reset(int[][] array2) {
		int numb = 0;
		int z;
		if (array2[q - 1][0] == 255) {
			// System.out.println(array2[q-1][0]);
			System.out.println("This must begin the reset process");

			for (z = 0; z < 256; z++) {
				array2[z][0] = numb;
				System.out.println("------" + array2[z][0]);
			}

		} else {
			System.out.println("No Reset necessary!");
		}

	}

	public static void main(String[] args) {
		LZW_ENCODER test = new LZW_ENCODER();
		int[][] array1 = new int[q][w];
		int[][] xam = test.populateNumbers(array1, q, w);

		test.reset(xam);
		
		for(int run=0;run<256;run++){
		System.out.println(array1[run][0]);
		}
		/*
		 * Random myRandom = new Random(); int[][] a = new int[2][2];
		 * 
		 * LZW_ENCODER test = new LZW_ENCODER();
		 */
	}

	/*
	 * private void create() { int [][] newArray = new int [4096][4096]; for(int
	 * i = 0; i<= 255; i++ ){ newArray[i][0] = i;
	 * System.out.println(newArray[i][0]); } }
	 */

}