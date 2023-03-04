// Java assignment Q.1

import java.util.Scanner;

class Mobike
{
	Scanner s = new Scanner(System.in);
	int bno, days, charge;
	long phno;
	String name;
	void input()
	{
		System.out.print("Name of Customer: ");
		name = s.nextLine();
		System.out.print("Phone no.: ");
		phno = s.nextLong();
		System.out.print("Bike no.: ");
		bno = s.nextInt();
		System.out.print("Number of days bike taken on rent: ");
		days = s.nextInt();
	}
	void compute()
	{
		if(days<=5)
		{
			charge = 500*days;
		}
		else if(days>=6 && days<=10)
		{
			charge = 400*days;
		}
		else if(days>10)
		{
			charge = 200*days;
		}
	}
	void display()
	{
		System.out.println("\n==================");
		System.out.println("Bike no.: "+bno);
		System.out.println("Phone no.: "+phno);
		System.out.println("No. of days: "+days);
		System.out.println("Charge: "+charge);
	}
}

class Main
{
	public static void main(String z[])
	{
		Mobike m = new Mobike();
		m.input();
		m.compute();
		m.display();
	}
}
import java.util.Scanner;
class Mobike
{
	Scanner sc = new Scanner(System.in);
	int bno;
	long phno;
	String name;
	int days;
	int charge;
	
	void input()
	{
		System.out.println("enter your Name:");
		name = sc.nextLine();
		System.out.println("enter the bike number:");
		bno = sc.nextInt();
		System.out.println("enter the Phone number:");
		phno = sc.nextLong();
		System.out.println("enter the no of days to rent:");
		days = sc.nextInt();
	}
	void compute()
	{
		if(days <= 5)
		{
			System.out.println("your total charge is:  " +(charge = days*500));
		}
		else if(days <= 6 && days >= 10)
		{
			System.out.println("your total charge is: " +(charge = days*400));
		}
		else 
		{
			System.out.println("your total charge is: " +(charge = days*200));
		}
		
	}
	void display()
	{
		System.out.print("Bike no: " +bno);
		System.out.print(" Phone  no: " +phno);
		System.out.print(" No of days no: " +days);
		System.out.println(" Charge: " +charge);
	}
}
class Bill
{
	public static void main(String args[])
{
	Mobike M = new Mobike();
	M.input();
	M.compute();
	M.display();
}
}


		

