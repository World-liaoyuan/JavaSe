import java.util.Scanner;

public class Test08{
    public static void main(String[] args){
        System.out.println("请输入一个时辰:");
        Scanner scanner = new Scanner(System.in);
        int time = scanner.nextInt();

        switch (time){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("早上好!");
                break;
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                System.out.println("上午好!");
                break;
            case 13:
            case 14:
                System.out.println("中午好!");
                break;
            case 15:
            case 16:
            case 17:
            case 18:
                System.out.println("下午好!");
                break;

            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
                System.out.println("晚上好!");
                break;
        }
    }
}