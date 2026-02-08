import java.util.Scanner;
class evenSumDigit 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number:");
		int n=sc.nextInt();
		int evensum=0;
		while(n>0){
			int lastDigit=n%10;
			n=n/10;
			if(lastDigit%2==0){
				
				evensum+=lastDigit;	
			}
		}
		System.out.println(evensum);
		
	}
}

/*

Enter any number:
34567
10

C:\Java_Programs>java evensumDigit.java
Enter any number:
2456813
20

*/
