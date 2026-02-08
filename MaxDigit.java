import java.util.Scanner;
class MaxDigit 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number:");
		int n=sc.nextInt();
		int max=Integer.MIN_VALUE;
		while(n>0){
			int lastdigit=n%10;
			max=Math.max(lastdigit, max);
			n=n/10;
		}
		System.out.println("Maximum Digit:"+max);
	}
}
