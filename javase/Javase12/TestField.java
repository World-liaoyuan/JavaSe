public class TestField {
    public static void main(String[] args) {
        Father f = new Son();
        System.out.println(f.x);//ֻ������ʱ����
    }
}
class Father{
    int x = 1;
}
class Son extends Father{
    int x = 2;
}