public class Employee {
    //feilds
    private int id;
    private String Firstname;
    private  String Lastname;
    private  int salary;

    public Employee(int id, String Firstname, String Lastname, int Salary){
        this.id=id;
        this.Firstname=Firstname;
        this.Lastname=Lastname;
        this.salary=Salary;
    }
    //getters
    public int getId(){
        return id;
    }
    public  String getFirstname(){
        return Firstname;
    }
    public String getLastname(){
        return Lastname;
    }
    public String getname(){
        return Firstname + " " + Lastname;
    }
    public int getSalary(){
        return salary;
    }
    public  void setSalary(int salary){
        this.salary=salary;
    }
    public  int getAnnualsalary(){
        return  salary * 12;
    }
    public  int raiseslary(int perecent){
        int amount=salary * (perecent/100);
        return salary + amount;
    }
    public String toString(){
        return  "Employee:" + "\tID: " + id + "\tName:" + getname()+ "\tsalary"+ salary;

        //



    }

    public static void main(String[] args) {
        Employee e1=new Employee(8,"Abdirahman","Abdikadir",200);
        System.out.println(e1);//to string
        //test setters and getters
        e1.setSalary(800);
        System.out.println("salary " + e1.getSalary());
        System.out.println("Firstname " + e1.getFirstname());

    }
}
