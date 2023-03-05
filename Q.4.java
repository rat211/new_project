class Polygon
{
	void polygon(int n, char ch)
	{
		for(int rows = 1; rows<=n; rows++)
		{
			for(int cols = 1; cols<=n; cols++)
			{
				System.out.print(ch);
			}
			System.out.println();
		}
	}
	void polygon(int x, int y)
	{
		for(int rows = 1; rows<=x; rows++)
		{
			for(int cols = 1;cols<=y; cols++)
			{
				System.out.print("@");
			}
			System.out.println();
		}
	}
	void polygon()
	{
		for(int rows = 1;rows<=3; rows++)
		{
			for(int cols = 1;cols<=rows; cols++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
class Main
{
	public static void main(String args[])
	{
		Polygon P = new Polygon();
		P.polygon(2,'O');
		P.polygon(2,5);
		P.polygon();
	}
}
		
	
