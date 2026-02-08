import java.util.Scanner;
class LastDigit 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number:");
		int n=sc.nextInt();
		
		while(n>0){
			int lastDigit=n%10;
			n=n/10;
			
			System.out.println(lastDigit);
		}
		
	}
}
