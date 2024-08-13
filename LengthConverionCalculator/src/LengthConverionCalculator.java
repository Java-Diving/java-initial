import java.util.Scanner;

public class LengthConverionCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Length:");
		double inch = scanner.nextDouble();
		double meters = inch * 0.0254;
		System.out.println(inch + " inch is " + meters + " meters");
	}

}
