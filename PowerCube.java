import java.util.Scanner;
class PowerCube 
{
	public static Scanner sc=new Scanner(System.in);
	public static int power(int a, int b)
	{
		int mul=1;
		for(int i=1;i<=b;i++)
		{
			mul=mul*a;
		}
		return mul;
	}
	
	public static void main(String[] args) 
	{
		System.out.println("Enter any num:");
		int n=sc.nextInt();
		int sum=0;
		while(n>0)
		{
			int ld=n%10;
			sum=sum + power(ld,3); //cube so 3
			n=n/10;
		}
		
		System.out.println("Sum is"+sum);
	}
}
