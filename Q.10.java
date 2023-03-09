import java.util.Scanner;
class Parkinglot
{
	Scanner sc = new Scanner(System.in);
	int vno;
	int hrs;
	double bill;
	
	void input()
	{
		System.out.println("enter your vehicle number " +vno);
		vno = sc.nextInt();
		System.out.println("enter the number of hours " +hrs);
		hrs = sc.nextInt();
	}
	void calculate()
	{
		if(hrs<=1)
		{
			bill = 3;
			
		}
		else if(hrs>1)
		{
			bill = 3+(1.5*hrs); 
			
		}
	}
	void display()
	{
		System.out.println("vehicle No " +vno);
		System.out.println("Number of hours " +hrs);
		System.out.println("bill amount " +bill+"Rs");
	}
}
class Main
{
	public static void main(String args[])
	{
		Parkinglot P = new Parkinglot();
		P.input();
		P.calculate();
		P.display();
	}
}
