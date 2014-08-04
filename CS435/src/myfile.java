import java.util.Random;
import java.util.Scanner;

public class myfile {
	public static int matrixMultiplication(int[] a, int[] b) {
		int[] Matrix_One = new int[4];
		int[] Matrix_Two = new int[4];
		Random myRandom = new Random();
		Scanner input = new Scanner(System.in);
		int one;
		String s;
		for (int i = 0; i < Matrix_One.length; i++) {
			for (int j = 0; j < Matrix_Two.length; j++) {
				Matrix_One[i] = myRandom.nextInt(5);
				Matrix_Two[j] = myRandom.nextInt(5);
			}
		}

		for (int t = 0; t < 4; t++) {
			System.out.println("first array");
			System.out.println(Matrix_One[t]);
			System.out.println("second array: ");
			System.out.println(Matrix_Two[t]);
		}
		
		do{
		System.out.println("Array1 index? ");
		one = input.nextInt();
		System.out.println("Array2 index");
		int two = input.nextInt();
		System.out.println(Matrix_One[one] * Matrix_Two[two]);
		}while(one != 0001);
		return 1;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("length of array?");
		int ans = input.nextInt();
		System.out.println("length of array2");
		int ans2 = input.nextInt();
		
		int[] M1 = new int[ans];
		int[] M2 = new int[ans2];
		matrixMultiplication(M1, M2);

	}
}
