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
		System.out.println("\n==================\n");
		System.out.println("Bike No.       PhoneNo.      No. of days       Charge");
		System.out.println(bno+"              "+phno+"    "+days+"            "+charge);
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
