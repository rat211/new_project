import java.util.Scanner;
class Library
{
	Scanner sc = new Scanner(System.in);
	int acc_num;
	String title;
	String author;
	int max_days = 10;	
	int late_days;
	//int num_days;
	int total_days;
	int fine;
	
	void input()
	{
		System.out.println("Enter the book title: ");
		title = sc.nextLine();
		System.out.println("Enter the book author name: ");
		author = sc.nextLine();
		System.out.println("Enter the book accession number: ");
		acc_num = sc.nextInt();
		System.out.println("Enter the total days of issue: ");
		total_days = sc.nextInt();
		
	}
	void compute()
	{
		if(total_days <= max_days)
		{
			System.out.println("No fine");
		}
		else
		{
			late_days = total_days - max_days;
			fine = late_days*2;
			System.out.println("your late days: " +late_days);
			System.out.println("your Fine is: " +fine);
		}
	}
	void display()
	{
		System.out.println("Accession Number: " +acc_num);
		System.out.println("Book Name: " +title);
		System.out.println("Author Name: "+author);
	}
}
class Member
{
	public static void main(String args[])	
{
	Library L = new Library();
	L.input();
	L.compute();
	L.display();
}
}	
