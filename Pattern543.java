class Pattern543 
{
	public static void main(String[] args) throws Exception
	{
		int n=5;
		for(int i=0;i<=n;i++)
		{
			for(int j=n;j>n-i;j--)
			{
					System.out.print(j+" ");
			}
			Thread.sleep(200);
			System.out.println();
		}
	}
}

/*


5
5 4
5 4 3
5 4 3 2
5 4 3 2 1

*/

