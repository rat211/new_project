// Java assignment Q3

import java.util.Scanner;

class TaxFinder
{
	Scanner s = new Scanner(System.in);
	String gender;
	double income,tax;
	int age;
	void input()
	{
		System.out.print("Enter your gender (male/female): ");
		gender = s.next();
		System.out.print("Age: ");
		age = s.nextInt();
		if(age>65 || gender.equals("female"))
		{
			System.out.println("Wrong category");
			System.exit(0);
		}
		System.out.print("Income: ");
		income = s.nextDouble();
	}
	void compute()
	{
		if(income<=160000)
		{
			System.out.println("Tax: Nil");
		}
		else if(income>160000 && income<=500000)
		{
			tax = (income-160000)*0.1;
		}
		else if(income>500000 && income<=800000)
		{
			tax = ((income-500000)*0.2)+34000;
		}
		else if(income>800000)
		{
			tax = ((income-800000)*0.3)+94000;
		}
		else
		{
			System.out.println("Enter valid income");
		}
	}
	void display()
	{
		System.out.println("=====================");
		System.out.println("Tax payable: "+tax);
	}
}

class Main
{
	public static void main(String z[])
	{
		TaxFinder t = new TaxFinder();
		t.input();
		t.compute();
		t.display();
	}
}
