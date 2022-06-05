import java.util.Scanner;

// 扫描器

public class Var{

    public static void main(String[] args) {
        // 演示接受用户的输入
        // 步骤
        // 1.引入Scanner的包
        // 2.创建Scanner对象
        // 3.接受用户的输入

        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入名字");
        String name = myScanner.next();
        System.out.println("请输入年龄：");
        int age = myScanner.nextInt();
        System.out.println("请输入薪水：");
        double sal = myScanner.nextDouble();
        System.out.println("人的信息如下：");

        System.out.println("name=" + name + " age=" + age + " sal=" + sal);


    }
}