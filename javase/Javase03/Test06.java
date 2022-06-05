import java.util.Scanner;

public class Test06{
    public static void main(String[] args){
        double discount = 1;
        double totalPrice = 0;
        System.out.println("请输入总价格:");
        Scanner sc = new Scanner(System.in);
        totalPrice = sc.nextDouble();

        if(totalPrice >= 500){
            discount = 0.5;
        } else if (totalPrice >= 400){
            discount = 0.6;
        } else if (totalPrice >= 300){
            discount = 0.7;
        } else if (totalPrice >= 200){
            discount = 0.8;
        } else if (totalPrice >= 0){
            discount = 1;
        } else {
            System.out.println("输入有误,请重新输入");
        }
        System.out.println("折扣:" + discount);
        System.out.println("折扣后总价:" + discount * totalPrice);


    }
}