import java.util.Scanner;

public class Test06{
    public static void main(String[] args){
        double discount = 1;
        double totalPrice = 0;
        System.out.println("�������ܼ۸�:");
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
            System.out.println("��������,����������");
        }
        System.out.println("�ۿ�:" + discount);
        System.out.println("�ۿۺ��ܼ�:" + discount * totalPrice);


    }
}