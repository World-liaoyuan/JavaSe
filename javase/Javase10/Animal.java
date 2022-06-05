public class Animal{
    private int id;
    private String name;
    private int age;
    private String color;
    private char gender;

    // 使用快捷键 alt+insert


    public Animal() {
    }

    public Animal(int id, String name, int age, String color, char gender) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.color = color;
        this.gender = gender;
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
}