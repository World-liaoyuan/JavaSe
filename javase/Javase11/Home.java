public class Home{
    public static void main(String[] args) {

    }
}

class Programmer extends Employee{
    private String language;

    public Programmer() {
    }

    public Programmer(int id, String name, int age, String salary, String language) {
        super(id, name, age, salary);
        this.language = language;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
}


class Employee{
    private int id;
    private String name;
    private int age;
    private String salary;

    public Employee(){}

    public Employee(int id, String name, int age, String salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }
}