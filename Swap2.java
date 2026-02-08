class Swap2
{
    public static  void main(String[] args)
    {
        int a=20;
        int b=10;
        System.out.println("Before Swapping");
        System.out.println("a value is: "+a);
        System.out.println("b value is: "+b);

        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After Swapping");
        System.out.println("a value is: "+a);
        System.out.println("b value is: "+b);


    }
}