import java.util.Scanner;

public class Test03{
    public static void main(String[] args) {

        int randNum = (int)(Math.random() * 100);

        //�Ӽ���������,������ʾ
        int num;
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("����0-100");
            num = scanner.nextInt();
            count++;
            if (num > randNum){
                System.out.println("����");
            } else if (num < randNum){
                System.out.println("С��");
            }
        } while (num != randNum);

        System.out.println("һ������:" + count + "��");
    }
}