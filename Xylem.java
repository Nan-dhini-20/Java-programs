import java.util.Scanner;
class Xylem 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number:");
		int n=sc.nextInt();
		int num=n;
		int lastdigit=n%10;
		n=n/10;
		int sum=0;
		while(n>9)
			{
				int ld =n%10;
			    sum+=ld;
				n=n/10;
				
			}
		System.out.println("Sum of middle digit:" +sum);
		
		int firstlast=lastdigit+n;
		
		System.out.println("Add of first and last digit:" +firstlast);
		if(sum==firstlast)
		{
			System.out.println(num+" is a Xylem num");
		}
		else
		{
			System.out.println(num+" is not a Xylem num");
		}
			
			
	}
}
