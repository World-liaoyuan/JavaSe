public class Student extends Person{
    private int score;

    public Student(){

    }
    public Student(String name, int age, char gender, int score){
        setName(name);
        setAge(age);
        setGender(gender);
        this.score = score;
    }

    public String getInfo(){
        return super.getInfo() + "成绩:" + score;
    }
    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}



public class Person{
    private String name;
    private int age;
    private char gender;

    public Person(String name, int age, char gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public Person(){

    }

    // getInfo方法
    public String getInfo(){
        return "姓名:" + name + "年龄:" + age + "性别:" + gender;
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

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
}