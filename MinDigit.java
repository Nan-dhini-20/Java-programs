import java.util.Scanner;
class MinDigit 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number:");
		int n=sc.nextInt();
		int min=Integer.MAX_VALUE;
		while(n>0){
			int lastdigit=n%10;
			min=Math.min(lastdigit, min);
			n=n/10;
		}
		System.out.println("Minimum Digit:"+min);
	}
}
