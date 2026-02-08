import java.util.Scanner;
class firstDigit 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number:");
		int n=sc.nextInt();
		
		
		while(n>9)
		{
			int lastdigit =n%10;
			n=n/10;
		}
		System.out.println("first digit:"+n);
	}
}
