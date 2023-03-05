// Java assignment Q4

class Shape
{
	void polygon(int n,char ch)
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++);
			{
				System.out.print(ch);
			}
			System.out.println();
		}
	}
	void polygon(int x,int y)
	{
		for(int i=1;i<=y;i++)
		{
			for(int j=1;j<=x;j++)
			{
				System.out.print("@");
			}
			System.out.println();
		}
	}
	void polygon()
	{
		for(int i=1;i<=3;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}

class Main
{
	public static void main(String z[])
	{
		Shape c = new Shape();
		c.polygon(2,'O');
		c.polygon(2,5);
		c.polygon();
	}
}
