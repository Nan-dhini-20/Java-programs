interface Student{
    void read();
}

public class Example{
    public static void main(String[] args) {
        Student s1=new Student(){
        @Override
        public void read(){
            System.out.println("Student is reading...");
        }
    };
    s1.read();
}
}