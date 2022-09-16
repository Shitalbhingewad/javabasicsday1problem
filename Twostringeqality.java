import java.util.Scanner;

public class problem3 {
	public static void main(String args[]) {
		String str1, str2;
		Scanner Scanner = new Scanner(System.in);

		System.out.println("Enter first String");
		str1 = Scanner.nextLine();

		System.out.println("Enter second String");
		str2 = Scanner.nextLine();
		// Comparing two input string
		if (str1.equals(str2))
			System.out.print("Equal Strings");
		else
			System.out.print("UnEqual Strings");
	}
}
