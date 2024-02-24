import java.util.Scanner;

public class palindromeCheck {
	public static boolean splitAndCompare(String input) {
	int length = input.length();

	//check length is even
	if (length % 2 != 0) {
		return false;
	}

	int halfLength = length /2;

	//split into halves
	String firstHalf = input.substring(0, halfLength);
	String secondHalf = input.substring(halfLength);

	//reverse second half
	StringBuilder reverseSecondHalf = new StringBuilder(secondHalf);
	reverseSecondHalf.reverse();

	return firstHalf.equals(reverseSecondHalf.toString());
}

public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	//test function
	//System.out.print("Enter string");
	String userInput = scanner.nextLine();
	//String input1 = "12345678";
	//String input2 = "abcabc";
	
	boolean isPalindrome = splitAndCompare(userInput);
	if (isPalindrome) {
		System.out.println(userInput + " is palindrome");
	} else {
		System.out.println(userInput + " is not a palindrome");
	}
	//System.out.println(input1 + " " + splitAndCompare(input1));

	scanner.close();
	}
}
