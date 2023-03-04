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


		
