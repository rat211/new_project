// Java assignment Q7

import java.util.Scanner;

class Discount
{
	Scanner s = new Scanner(System.in);
	String name, address;
	double amount,discount,net_amount;
	char type;
	void input()
	{
		System.out.println("Name:");
		name = s.nextLine();
		System.out.println("Address:");
		address = s.nextLine();
		System.out.println("Amount of purchase:");
		amount = s.nextDouble();
		System.out.println("Type of purchase (L for laptop/ D for Desktop):");
		type = s.next().charAt(0);
	}
	void compute()
	{
		switch(type)
		{
			case 'L':
			if(amount<=25000)
			{
				discount = (0.0/100)*amount;
				net_amount = amount-discount;
			}
			else if(amount>25000 && amount<=57000)
			{
				discount = (5.0/100)*amount;
				net_amount = amount-discount;
			}
			else if(amount>57000 && amount<=100000)
			{
				discount = (7.5/100)*amount;
				net_amount = amount-discount;
			}
			else if(amount>100000)
			{
				discount = (10.0/100)*amount;
				net_amount = amount-discount;
			}
			else
			{
				System.out.println("Enter valid amount of purchase");
			}
			break;

			case 'D':
			if(amount<=25000)
			{
				discount = (5.0/100)*amount;
				net_amount = amount-discount;
			}
			else if(amount>25000 && amount<=57000)
			{
				discount = (7.5/100)*amount;
				net_amount = amount-discount;
			}
			else if(amount>57000 && amount<=100000)
			{
				discount = (10.0/100)*amount;
				net_amount = amount-discount;
			}
			else if(amount>100000)
			{
				discount = (15.0/100)*amount;
				net_amount = amount-discount;
			}
			else
			{
				System.out.println("Enter valid amount of purchase");
			}
			break;
	
			default:
			System.out.println("Enter valid type of purchase(L/D)");
		}
	}
	void output()
	{
		System.out.println("Name: "+name);
		System.out.println("Address: "+address);
		System.out.println("Net amount: "+net_amount);
	}
}

class Main
{
	public static void main(String z[])
	{
		Discount d = new Discount();
		d.input();
		d.compute();
		d.output();
	}
}
