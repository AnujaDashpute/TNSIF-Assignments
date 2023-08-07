package assignment1;
import java.util.Scanner;
public class Assignment1 
{
	
	public static void main(String[] args) 
	{
		int num1, num2;
		int choice;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 1st number : ");
		num1 = sc.nextInt();
		System.out.println("Enter the 2nd number : ");
		num2 = sc.nextInt();
		
		do
		{
			System.out.println("\n\n1. Addition \n2. Subtraction");
			System.out.println("3. Multiplication \n4. Division \n\n");
			System.out.println("Enter the operation to be performed : ");
			choice = sc.nextInt();
			
			
			switch(choice)
			{
			case 1 :
				int sum = num1 + num2;
				System.out.println("Addition : "+sum);
				break;
			case 2 :
				int subtract = num1 - num2;
				System.out.println("Subtraction : "+subtract);
				break;
			case 3 :
				int product = num1 * num2;
				System.out.println("Multiplication : "+product);
				break;
			case 4 :
				int quotient = num1 / num2;
				System.out.println("Division : "+quotient);
				break;
			}
		}while(choice<=4);
		System.out.println("Invalid choice !");
	}
}
