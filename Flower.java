class Flower 
{
	public static void main(String[] args) throws Exception 
	{
		int n=4;
		for(int i=0;i<=n;i++)
		{
			for(int j=0;j<=n;j++)
			{
				if(i==n/2 || j==n/2 || i==j || i+j==n)
					System.out.print("* ");
				else
					System.out.print("  "); 
			}
			Thread.sleep(100);
		System.out.println();
		}
	}
}
	
				
				
				
				
/*	

				
*   *   *
  * * *
* * * * *
  * * *
*   *   *


*/