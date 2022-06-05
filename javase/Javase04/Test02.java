import java.util.Scanner;

public class Test02{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int positive = 0;
        int negative = 0;
        int num;

        do {
            System.out.println("输入整数0结束");
            num = input.nextInt();
            if(num > 0){
                positive++;
            } else if (num < 0){
                negative++;
            }
        } while (num != 0);

        System.out.println("正数" + positive + "负数" + negative);
        
    }
}