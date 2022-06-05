import java.util.Scanner;


public class Test07{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入m:");
        int m = input.nextInt();
        System.out.println("请输入n:");
        int n = input.nextInt();

        System.out.println("两个正整数 m:" + m + "\tn:" + n);


        // 求两个正整数的最大公约数和最小公倍数
        int max = m >= n ? m : n;
        int min = m < n ? m : n;

        int maxYue = 1;
        for(int i = min; i>= 1; i--){
            if(m % i == 0 && n % i == 0){
                maxYue = i;
                break;
            }
        }

        // 最小公倍数
        int minBei = m * n / maxYue;
        System.out.println("最大公约数: " + maxYue);
        System.out.println("最小公倍数: " + minBei);

    }
}