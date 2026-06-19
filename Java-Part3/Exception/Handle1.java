public class Handle1{
    public static void main(String[] args) {
        int a=36;
        int b=0;
        
        try {
            System.out.println("Addition:"+(a+b));
            System.out.println("Division:"+(a/b));
            System.out.println("multiply:"+(a*b));  //not execute
        } catch (ArithmeticException e) {
            System.out.println("I handled your problem");
        }
    }
}