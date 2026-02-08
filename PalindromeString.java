import java.util.Scanner;
class palindromeString 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a word:");
		
		String str=sc.next();
		str=str.toLowerCase();        //convert it into lower
		String rev="";
		
		for(int i=str.length()-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		if(str.equalsIgnoreCase(rev)){          //for case insensitive; for case-sensitive str.equals()
			System.out.println(str+ " is a palindrome");
		}
		else{
			System.out.println(str+ " is not a palindrome");
			}
	}
}
