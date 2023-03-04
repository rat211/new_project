import java.util.Scanner;
public class SimpleCalculator
{
public static void main(String args[])
{
	int choice;
	Scanner sc = new Scanner(System.in);
	
	do
	{
		//Scanner sc = new Scanner(System.in);
		System.out.println("enter the first number");
		int n1 = sc.nextInt();
		System.out.println("enter the second number");
		int n2 = sc.nextInt();
		int Ans;
		System.out.println("enter 1 for Addition:");
		System.out.println("enter 2 for Substraction:");
		System.out.println("enter 3 for Multiplication:");
		System.out.println("enter 4 for Division:");
		System.out.println("enter 5 for exit the application:");
		System.out.println("enter the choice");
		choice = sc.nextInt();
		switch(choice)
		{
			case 1:
			System.out.println("result = " +(n1+n2));
			break;
			
			case 2:
			System.out.println("result = " +(n1-n2));
			break;
			
			case 3:
			System.out.println("result = " +(n1*n2));
			break;
			
			case 4:
			if(n2==0)
				System.out.println("error! number cannot divide by zero");
			else
			System.out.println("result = " +(n1/n2));
			break;
			
			case 5:
			System.out.println("exit the application");
			break;
			
			default:
			System.out.println("please select a valid choice:");
			
		}
	}while(choice!=5);
}
}
//Edited comment
