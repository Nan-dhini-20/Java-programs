interface Student{
    void study();
}

public class Sample{
    public static void main(String[] args) {
        class Person implements Student{
        @Override
        public void study(){
            System.out.println("Student is studying...");
            }
        }
        Person p=new Person();
        p.study();
    }
}