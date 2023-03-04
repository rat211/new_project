import java.util.Scanner;
class Criteria
{
	Scanner sc = new Scanner(System.in);
	int age;
	String gender;
	double tax_inc;
	
	void input()
	{
		System.out.println("enter your gender:");
		gender = sc.nextLine();
		System.out.println("enter your age :");
		age = sc.nextInt();
		 if(age > 65 || gender.equals("female"))
		{
			System.out.println("Wrong category");
			System.exit(0);
		} 
		System.out.println("enter your taxable income: ");
		tax_inc = sc.nextDouble();
	}
	void compute()
	{
		if(tax_inc <= 160000)
		{
			System.out.println("your are in Nil category");
		}
		else if(tax_inc > 160000 && tax_inc <= 500000)
		{
			System.out.println("your Income tax is: " +(tax_inc-160000)*0.1);
		}
		else if(tax_inc > 500000 && tax_inc <= 800000)
		{
			System.out.println("your Income tax is: " +((tax_inc-500000)*0.2)+34000);
		}
		else if(tax_inc > 800000)
		{
			System.out.println("your Income tax is: " +((tax_inc-800000)*0.3)+34000);
		}
	}
}
class Incometax
{
	public static void main(String args[])
	{
		Criteria C = new Criteria();
		C.input();
		C.compute();
	}
}
			
			
	
	
