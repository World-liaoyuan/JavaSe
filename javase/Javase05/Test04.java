import java.util.Scanner;

public class Test04{
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);

        System.out.print("��:");
        int year = input.nextInt();

        System.out.print("��:");
        int month = input.nextInt();

        System.out.print("��:");
        int day = input.nextInt();

        int[] daysPerMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int days = day;
        for(int i = 1; i < month; i++){
            if(i == 2){
                if(year%4 == 0 && year % 100 != 0 || year % 400 == 0){
                    days++;
                }
            }
            days += daysPerMonth[i-1];
        }

        System.out.println("��һ���Ƕ�Ӧ�ĵ����" + days);
    }
}