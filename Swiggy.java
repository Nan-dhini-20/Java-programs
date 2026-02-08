import java.util.Scanner;
class Swiggy 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		
		System.out.println("Welcome to our hotel");
		System.out.println("Restaurants");
		System.out.println("1.A2B \n 2.Amma Canteen \n 3.PS4");
		System.out.println("Select any one option");
		int option=sc.nextInt();
		int price=0;
		int bill=0;
		int food=0;
		int quantity=0;
		char ch='';
		int amount=0;
		int otp=0;
		int userotp=0;
		
		switch(option)
		{
			case 1: System.out.println("welcome to A2B");
					System.out.println("1.Mutton Briyaani 350rs \n 2.Chicken Briyaani 250rs \n 3. Chicken Fried rice 200rs");
					System.out.println("Select any Food");
					food=sc.nextInt();
					
					if(food==1)
						price =350;
					if(food==2)
						price =250;
					if(food==3)
						price =200;
					else
						System.out.println("Wrong food");
					
					System.out.println("Enter the quantity:");
					qunatity=sc.nextInt();
					
					bill=quantity*price;
					System.out.println("Your bill is: "+bill);
					
					System.out.println("Do you want to pay y/n: ");
					ch=sc.next().CharAt(0);
					
					if(ch=='y' || ch=='Y')
					{
						System.out.println("Enter the amount:");
						amount=sc.nextInt();
						
						if(bill==amount)
						{
							otp= (int)(Math.random() * 9000)+1000;
							System.out.println("Your otp is: " +otp);
							
							System.out.println("Enter your otp:");
							int userotp=sc.nextInt();
							
							if(otp==userotp)
							{
								System.out.println("Payment Processing....");
								Thread.sleep(200);
								System.out.println("Order is placed!");
							}
							else
							{
								System.out.println("Enter the correct otp");
							}
						}
						else
						{
							System.out.println("Enter the correct amount");
						}
					}
					else
					{
						System.out.println("Order cancelled!!");
					}
					break;
					
			case 2: System.out.println("Welcome to Amma Canteen!");
					System.out.println("1. Chilli chicken 150rs \n 2. Paneer fried Rice 200rs \n 3. Veg Briyaani 100rs");
					System.out.println("Select any Food");
					food=sc.nextInt();
					
					if(food==1)
						price =150;
					if(food==2)
						price =200;
					if(food==3)
						price =100;
					else
						System.out.println("Wrong food");
					
					System.out.println("Enter the quantity:");
					qunatity=sc.nextInt();
					
					bill=quantity*price;
					System.out.println("Your bill is: "+bill);
					
					System.out.println("Do you want to pay y/n: ");
					ch=sc.next().CharAt(0);
					
					if(ch=='y' || ch=='Y')
					{
						System.out.println("Enter the amount:");
						amount=sc.nextInt();
						
						if(bill==amount)
						{
							otp= (int)(Math.random() * 9000)+1000;
							System.out.println("Your otp is: " +otp);	
							
							System.out.println("Enter your otp:");
							userotp=sc.nextInt();
							
							if(otp==userotp)
							{
								System.out.println("Payment Processing....");
								Thread.sleep(200);
								System.out.println("Order is placed!");
							}
							else
							{
								System.out.println("Enter the correct otp");
							}
						}
						else
						{
							System.out.println("Enter the correct amount");
						}
					}
					else
					{
						System.out.println("Order cancelled!!");
					}
					break;
			case 3: System.out.println("Welcome to PS4");
					System.out.println("1. Dragon chicken 200rs \n 2. Bun Parotta 250rs \n 3. Egg Fried Rice 150rs");
					System.out.println("Select any Food");
					food=sc.nextInt();
					
					if(food==1)
						price =150;
					if(food==2)
						price =200;
					if(food==3)
						price =100;
					else
						System.out.println("Wrong food");
					
					System.out.println("Enter the quantity:");
					qunatity=sc.nextInt();
					
					bill=quantity*price;
					System.out.println("Your bill is: "+bill);
					
					System.out.println("Do you want to pay y/n: ");
					ch=sc.next().CharAt(0);
					
					if(ch=='y' || ch=='Y')
					{
						System.out.println("Enter the amount:");
						amount=sc.nextInt();
						
						if(bill==amount)
						{
							otp= (int)(Math.random() * 9000)+1000;
							System.out.println("Your otp is: " +otp);	
							
							System.out.println("Enter your otp:");
							userotp=sc.nextInt();
							
							if(otp==userotp)
							{
								System.out.println("Payment Processing....");
								Thread.sleep(200);
								System.out.println("Order is placed!");
							}
							else
							{
								System.out.println("Enter the correct otp");
							}
						}
						else
						{
							System.out.println("Enter the correct amount");
						}
					}
					else
					{
						System.out.println("Order cancelled!!");
					}
					break;
		}
	}
}
