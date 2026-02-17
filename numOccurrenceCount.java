import java.util.Scanner;
class numOccurrenceCount
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any Number:");
		int num=sc.nextInt();
		for(int i=0;i<9;i++)
		{
			
			int n=num; //temp var
			int count=0;
			while(n>0)
			{
			int ld=n%10;
			if(ld==i)
			{
				count++;
			}
				
			n=n/10;
			}
			if(count>0)
			{
				System.out.println(i+ "=" +count+ "times");
			}
		}
	
	}
}
