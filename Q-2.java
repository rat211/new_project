// Java assignment 2

import java.util.Scanner;

class Library
{
	Scanner s = new Scanner(System.in);
	int acc_num,days,late,fine;
	String title,author;
	void input()
	{
		System.out.print("Book name: ");
		title = s.nextLine();
		System.out.print("Author: ");
		author = s.nextLine();
		System.out.print("Accession number: ");
		acc_num = s.nextInt();
	}
	void compute()
	{
		System.out.print("Total days: ");
		days = s.nextInt();
		late = days-10;
		fine = late*2;
		if(fine>0)
		{
			System.out.println("Fine charged: "+fine);
		}
		else
		{
			System.out.println("No fine charged");
		}
	}
	void display()
	{
		System.out.println("\n===================");
		System.out.println("Accession Number          Title                 Author");
		System.out.println(acc_num+"                    "+title+"             "+author); 	
	}
}

class Main
{
	public static void main(String z[])
	{
		Library c = new Library();
		c.input();
		c.compute();
		c.display();
	}
}
