interface Student{
    void study();
}

public class Practice{
    public static void main(String[] args) {
        Student s1=()->{
            System.out.println("Student is studying..");

        };
        s1.study();
    }
}