import java.util.Scanner;

public class Test03{
    public static void main(String[] args) {

        int randNum = (int)(Math.random() * 100);

        //从键盘输入数,大了提示
        int num;
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("猜数0-100");
            num = scanner.nextInt();
            count++;
            if (num > randNum){
                System.out.println("大了");
            } else if (num < randNum){
                System.out.println("小了");
            }
        } while (num != randNum);

        System.out.println("一共猜了:" + count + "次");
    }
}