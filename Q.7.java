import java.util.*;
class Criteria
{
	Scanner sc = new Scanner(System.in);
	String name;
	String address;
	int amount;
	char purchaseType;
	double discount;
	double netAmount;
	
	void input()
	{
		System.out.println("enter your Name: ");
		name = sc.nextLine();
		System.out.println("enter your Address: ");
		address = sc.nextLine();
		System.out.println("enter the purchase amount: ");
		amount = sc.nextInt();
	}
	
	void laptop()
	{
		
		if(amount>0 && amount<25000)
		{
			 discount = (0.0/100)*amount;
			 netAmount = amount-discount;
		}
		else if(amount>25001 && amount<57000)
		{
			 discount = (5.0/100)*amount;
			 netAmount = amount-discount;
		}
		else if(amount>57001 && amount<100000)
		{
			 discount = (7.5/100)*amount;
			 netAmount = amount-discount;
		}
		else if(amount>100000)
		{
			discount = (10.0/100)*amount;
			netAmount = amount-discount;
		}
		
	}
	
	void desktop()
	{
		
		if(amount>0 && amount<=25000)
		{
			 discount = (5.0/100)*amount;
			 netAmount = amount-discount;
		}
		else if(amount>25001 && amount<=57000)
		{
			 discount = (7.6/100)*amount;
			 netAmount = amount-discount;
		}
		else if(amount>57001 && amount<=100000)
		{
			 discount = (10.0/100)*amount;
			 netAmount = amount-discount;
		}
		else if(amount>100001)
		{
			discount = (15.0/100)*amount;
			netAmount = amount-discount;
		}

	}
	void display()
	{
		System.out.println("Name : " +name);
		System.out.println("Address : " +address);
		System.out.println("Discount Price: " +discount);
		System.out.println("Net Amount: " +netAmount);

	}
}
class Main
{
	public static void main(String args[])
	{
		Scanner sc1 = new Scanner(System.in);
		Criteria C = new Criteria();
		char choice;
		System.out.println("Enter 'L' for Laptop\nEnter 'D' for Desktop");
		choice = sc1.next().charAt(0);
			switch(choice)
			{
				case 'L':
				C.input();
				C.laptop();
				C.display();
				break;
				
				case 'D':
				C.input();
				C.desktop();
				C.display();
				break;
				
				default:
				System.out.println("please enter the valid choice");
			}
	}
}
				
