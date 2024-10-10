import java.util.Scanner;
import java.util.Stack;

public class CharSackMain {
	
	//private final static String braces = "(()(())())"; 
	
	public static void main(String[] args) {
		Stack<Character> stack = new Stack<Character>();
		
		Scanner sc = new Scanner(System.in);
		String braces = sc.nextLine();
		
		if(braces.charAt(0) == ')') {
			print(false);
			return;
		}
		
		for(int i = 0; i < braces.length(); i++) {
			if(braces.charAt(i) == ')' 
					&& !stack.isEmpty() 
					&& stack.peek() == '(') {
				stack.pop();
			} else {
				stack.add(braces.charAt(i));
			}
		}
		
		print(stack.isEmpty());
	}

	private static void print(boolean b) {
		if(b) {
			System.out.println("Braces are idle!");
		} else {
			System.out.println("Braces are not idle!");
		}
	}

}
