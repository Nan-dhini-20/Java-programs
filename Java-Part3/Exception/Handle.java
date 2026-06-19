public class Handle{
    public static void main(String[] args) {
        int a=36;
        int b=0;
        System.out.println("Addition:"+(a+b));
        try {
            System.out.println("Division:"+(a/b));
        } catch (ArithmeticException e) {
            System.out.println("I handled your problem");
        }
    }
}