import java.util.Scanner;

public class WeekDaysAndWeekends {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int day = input.nextInt();
		
		switch(day) {
		case 1, 2, 3, 4, 5 -> System.out.println("Weekdays");
		case 6, 7 -> System.out.println("Weekends");
		}
	}

}
