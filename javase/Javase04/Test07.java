import java.util.Scanner;


public class Test07{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("������m:");
        int m = input.nextInt();
        System.out.println("������n:");
        int n = input.nextInt();

        System.out.println("���������� m:" + m + "\tn:" + n);


        // �����������������Լ������С������
        int max = m >= n ? m : n;
        int min = m < n ? m : n;

        int maxYue = 1;
        for(int i = min; i>= 1; i--){
            if(m % i == 0 && n % i == 0){
                maxYue = i;
                break;
            }
        }

        // ��С������
        int minBei = m * n / maxYue;
        System.out.println("���Լ��: " + maxYue);
        System.out.println("��С������: " + minBei);

    }
}