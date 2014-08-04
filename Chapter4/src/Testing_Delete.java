import java.util.Scanner;
public class Testing_Delete {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Testing my_Testing = new Testing(); //create object
		Scanner input = new Scanner(System.in);
		System.out.printf("Hello what's your favorite number?");
		int response = input.nextInt();
		my_Testing.setName(response);
		my_Testing.myMessage(my_Testing.getName() );
	}

}
