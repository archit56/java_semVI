// print half-right kite

class FactorialUsingRecursion
{
	public static void main(String args[])
	{
		int y = 101;
		int z;
	for(int i = 1; i<=5;i++)
	{
		for(int j=0;j<i;j++)
		{
			z=y%2;
			y--;
			System.out.print(z);
		}
		System.out.println();
	}
	for(int i = 4; i>=1;i--)
	{
		for(int j=0;j<i;j++)
		{
			z=y%2;
			y--;
			System.out.print(z);
		}
		System.out.println();
	}
	
	}
}
		
	