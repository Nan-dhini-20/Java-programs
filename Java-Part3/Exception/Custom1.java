//checked Custom Exception
class NotStudying extends Exception
{
    NotStudying(String msg)
    {
        super(msg);
    }
}


public class Custom1 
{
	public static void school() throws NotStudying
	{
        int marks=30;
        if(marks>=50)
        {
            System.out.println("very good");
        }
        else
        {
           throw new NotStudying("bad");
        }
    }
    public static void main(String[] args) 
    {
        try
        {
             school();
        }
        catch(NotStudying e){
            System.out.println(e);
            System.out.println(e.getMessage());  //only exception message will print
        }
       
    }
}