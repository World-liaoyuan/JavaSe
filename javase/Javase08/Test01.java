import java.util.Scanner;


public class Test01{
    public static void main(String[] args) {
        Student[] arr = new Student[3];
        arr[0] = new Student();
        arr[0].name = "张三";
        arr[0].score = 89;

        arr[1] = new Student();
        arr[1].name = "李四";
        arr[1].score = 84;

        arr[2] = new Student();
        arr[2].name = "王五";
        arr[2].score = 85;

        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr.length - 1 - i; j++)
                if (arr[j].score > arr[j+1].score){
                    Student temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
        }

        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i].getInfo());
        }



    }
}

class Student{
    String name;
    int score;


    public String getInfo(){
        return "姓名:" + name + " 成绩:" + score;
    }
}

