import java.util.Scanner;
class Power 
{
	public static Scanner sc=new Scanner(System.in);
	public static int power(int a, int b)
	{
		int mul=1;
		for (int i=1; i<=b;i++ )
		{
			mul*=a;
		}
		return mul;
	}
	public static void main(String[] args) 
	{
		System.out.print("Enter base number:");
		int a=sc.nextInt();
		System.out.print("Enter power number:");
		int b=sc.nextInt();
		
		System.out.println(power(a,b));
		
	}
}
