import java.util.Scanner;
class RevTri
{
	public static void main(String[] args) throws Exception
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				if(i<=j && i+j<=n-1){
					System.out.print("* ");
				}
				else{
					System.out.print("  ");
				}
				Thread.sleep(100);
			}
			System.out.println();
		}
	}
}


/*
Enter the number:
6
* * * * * *
 * * * * *
  * * * *
   * * *
    * *
     *
	 
	 */
	 
