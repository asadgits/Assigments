package first;

public class Student {
    private Integer  id ;
    private String name;
    private String address;
    private Integer age;


    public Student(int id, String name, String address, int age) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", age=" + age +
                '}';
    }

    public Integer getId() {return this.id;}

    public String getName() {return this.name;}

    public String getAddress() {return this.address;}

    public Integer getAge() {return this.age;}

}
