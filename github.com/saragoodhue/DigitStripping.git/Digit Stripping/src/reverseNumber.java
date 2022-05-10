import java.util.Scanner;

public class reverseNumber
	{

		public static void main(String[] args)
			{
				System.out.println("Enter any number with more than two digits below: ");
				Scanner digits = new Scanner(System.in);
				int number = digits.nextInt();
				int reverse = 0;

				while (number > 0)
					{
						int digitReverse = number % 10;
						reverse = reverse * 10 + digitReverse;
						number = number / 10;
					}

				System.out.println("Your reversed number is: " + reverse);
			}

	}
