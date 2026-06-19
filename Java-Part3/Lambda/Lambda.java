@FunctionalInterface
interface Operation{
    void multiply();
}
interface Operation2{
    void division(int a, int b);

}
interface Operation3{
    int add(int a, int b);
}
public class Lambda{
    public static void main(String[] args) {

        //lambda function 
        Operation op=()->{
            
                System.out.println("Multiply is:"+(3*5));
        };
        op.multiply();

        Operation2 op2=(a,b)->{
            System.out.println("Division is:"+(a/b));
        };
        op2.division(20,2);

        //lamba expression with return type
        Operation3 op3=(a,b)->a+b;
           // return a+b;           
        System.out.println("Addition is:" +op3.add(20,10));
    }
} 