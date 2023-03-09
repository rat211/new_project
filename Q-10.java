//Java assignment Q 10

import java.util.Scanner;

class ParkingLot
{
	Scanner s = new Scanner(System.in);
	int vno,hours;
	double bill;
	void input()
	{
		System.out.println("Vehicle no:");
		vno = s.nextInt();
		System.out.println("Number of Hours the car is parked:");
		hours = s.nextInt();
	}
	void calculate()
	{
		if(hours<=1)
			bill = 3;
		else if(hours>1)
			bill = 3+(1.5*hours);
	}
	void output()
	{
		System.out.println("Vehicle No.: "+vno);
		System.out.println("Hours car parked: "+hours);
		System.out.println("Bill : Rs "+bill);
	}
}

class Main
{
	public static void main(String z[])
	{
		ParkingLot pl = new ParkingLot();
		pl.input();
		pl.calculate();
		pl.output();
	}
}
