interface Calculate{
    void  add();
}

public class Calculator{
    public static void main(String[] args){
        /*class A implements Calculate{
            @Override 
            
        }

        Calculate c=new A();
        c.add();*/

        Calculate c=new Calculate(){
            @Override
            public void add(){
                System.out.println("I am add method");
            }
        };
        c.add();
    }
}
