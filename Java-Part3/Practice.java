class Practice 
{
	Practice Reading(){
		System.out.println("Reading...");
		return this;
	}
	Practice Writing(){
		System.out.println("Writing...");
		return this;
	}
	Practice mock(){
		System.out.println("Giving Mock...");
		return this;
	}
	public static void main(String[] args) 
	{
		
		Practice p=new Practice();
		/*p.Reading();
		p.Writing();
		p.mock();*/
		
		p.Reading().Writing().mock();  //Method Chaining
	}
}
