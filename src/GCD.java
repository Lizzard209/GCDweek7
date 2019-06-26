import java.util.Scanner;

public class GCD {

	public static void main(String[] args) throws OutOfRangeException {
		Scanner scan = new Scanner(System.in);

		OutOfRangeException problem = new OutOfRangeException("Greatest Common Divisor is 1");

		System.out.println("Enter a postive integer");
		int num1 = scan.nextInt();

		System.out.println("Enter another postive integer");
		int num2 = scan.nextInt();
		scan.close();

		int gcd = gcd(num1, num2);

		if (gcd > 1) {
			System.out.println("The GCD is " + gcd);
		} else {
			throw problem;
		}
	}

	public static int gcd(int num1, int num2) {
		while (num1 != num2)
			if (num1 > num2) {
				num1 = num1 - num2;
			} else {
				num2 = num2 - num1;
			}
		return num1;
	}
}