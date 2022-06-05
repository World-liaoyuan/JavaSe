import java.util.Scanner;

public class Test07{
    public static void main(String[] args){
        int temp;
        String name = null;
        String passwd = null;

        do{
            System.out.println("欢迎来到尚硅谷 1 注册 2 登录 3 退出");
            Scanner sc = new Scanner(System.in);
            temp = sc.nextInt();

            if (temp == 1){
                System.out.println("欢迎来到注册页面:");
                System.out.println("请输入用户名和密码:");
                Scanner sc1 = new Scanner(System.in);
                name = sc1.next();
                passwd = sc1.next();
                System.out.println("注册成功!");
            }

            if (temp == 2){
                System.out.println("欢迎来到登录页面:");
                System.out.println("请输入用户名和密码:");
                Scanner sc2 = new Scanner(System.in);
                String nameNew = sc2.next();
                String passwdNew = sc2.next();
                if (name.equals(nameNew) && passwd.equals(passwdNew)){
                    System.out.println("登录成功!");
                } else {
                    System.out.println("用户名和密码错误");
                }

            }
            if (temp == 3){
                System.out.println("确定要退出吗?");
                Scanner sc3 = new Scanner(System.in);
                String quit = sc3.next();
                if(quit.equals("y")){
                    break;
                }

            }


        } while(true);





    }
}