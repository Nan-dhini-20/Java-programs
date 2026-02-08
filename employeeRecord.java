import java.util.Scanner;
class employeeRecord 
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		
		System.out.print("Name: ");
		String name= sc.nextLine();
		
		System.out.print("ID: ");
		int empID= sc.nextInt();
		
		System.out.print("Age: ");
		byte age= sc.nextByte();
		
		System.out.print("Experience years: ");
		short year= sc.nextShort();
		
		System.out.print("Salary: ");
		double salary= sc.nextDouble();
		
		System.out.print("Bonus Percentage: ");
		float BPercentage= sc.nextFloat();
		
		System.out.print("Department Code: ");
		char Dcode= sc.next().charAt(0);
		
		System.out.print("Is Permanent Employee: ");
		boolean emp= sc.nextBoolean();
		
		System.out.print("Contact Number: ");
		long Phoneno= sc.nextLong();
		
		
		System.out.println("\nEmployee Full Record");
		System.out.println("Name: "+name);
		System.out.println("ID: "+empID);
		System.out.println("Age: "+age);
		System.out.println("Experience Year: "+year);
		System.out.println("Salary: "+salary);
		System.out.println("Bonus Percentage: "+BPercentage);
		System.out.println("Department Code: "+Dcode);
		System.out.println("Is Permanent Employee: "+emp);
		System.out.println("Contact Number: "+Phoneno);
	}
}
