import java.util.Scanner;

public class CelsiusToFerenheit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double celsius = input.nextDouble();
		double fehrenheit = (celsius * 9 / 5) + 32;
		System.out.println("Fehrenheit: " + fehrenheit);
	}

}
