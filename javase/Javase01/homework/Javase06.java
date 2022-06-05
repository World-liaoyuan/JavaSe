public class Javase06{
    public static void main(String[] args){
        int temp;
        int a = 10;
        int b = 20;


        temp = a;
        a = b;
        b = temp;

        System.out.println(a);
        System.out.println(b);
    }
}