package three;

public class Employee implements IPerson{

    private String id;
    private String name;
    private String FatherName;
    private String department;

    public Employee(String id , String name , String fatherName , String department){
        this.id = id;
        this.name = name;
        this.FatherName = fatherName;
        this.department = department;
    }

    public void Details() {
        System.out.println("Employee Id : "+ this.id);
        System.out.println("Employee Id : "+ this.name);
        System.out.println("Employee Id : "+ this.FatherName);
        System.out.println("Employee Id : "+ this.department);
    }


}
