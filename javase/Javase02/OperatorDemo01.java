public class OperatorDemo01{
    public static void main(String[] args){
        int a = 3;
        int b = 4;

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);


        System.out .println("============================");
        String str1 = "Hello";
        System.out.println(str1 + "World");

        String str2 = "Java";
        System.out.println(str2 + 520);

        System.out .println("============================");
        int aa = 3;
        aa++;
        ++aa;
        System.out.println(aa);
        System.out .println("============================");

        int aaa = 3;
        int bbb = 4;
        aaa += bbb;


        System.out.println(aaa);
        System.out.println(bbb);
        System.out .println("============================");

        System.out.println(aaa > bbb);
        System.out.println(aaa <= bbb);
        System.out.println(aaa != bbb);
        System.out.println(aaa == bbb);

    }
}