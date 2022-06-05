public class Test01{

    public static void  main(String[] args){
        int num = 1234;

        // 通过操作数计算出个位,十位,百位,千位
        int ge = num % 10;
        int shi = num / 10 % 10;
        int bai = num / 100 % 10;
        int qian = num / 1000 % 10;

        System.out.println("十位的数字是:" + shi);
    }
}