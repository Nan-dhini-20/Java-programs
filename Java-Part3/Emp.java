public class Emp{
    private String ename;
    private int eid;

   
    public String getEname(){
        return this.ename; 
    }
    public int getEid()
    {
        return this.eid;
    }
    Emp setEname(String ename){
        this.ename=ename;
        return this;
    }
    Emp setEid(int eid){
        this.eid=eid;
        return this;
    }
    void empDetails(){
        System.out.println("emp name is:"+getEname());
        System.out.println("emp id is:"+getEid());

    }
    public static void main(String[] args) {
        Emp e=new Emp();

        e.setEname("Nandy").setEid(101).empDetails();   //Method Chaining
    }
}