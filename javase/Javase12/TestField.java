public class TestField {
    public static void main(String[] args) {
        Father f = new Son();
        System.out.println(f.x);//只看编译时类型
    }
}
class Father{
    int x = 1;
}
class Son extends Father{
    int x = 2;
}