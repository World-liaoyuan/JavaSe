interface LiveAble{
    //定义抽象方法
    public abstract void eat();

    // 定义默认方法
    public default void sleep(){
        System.out.println("静止不动");
    }

    // 定义静态方法
    public static void drink(){
        System.out.println("喝水");
    }
}

class Animal implements LiveAble{


    @java.lang.Override
    public void eat() {
        System.out.println("吃东西");
    }

    // 重写默认方法
    public void sleep(){
        System.out.println("闭上眼睛睡觉");
    }
}

public class InterfaceDemo{
    public static void main(String[] args) {

        Animal a = new Animal();

        a.eat();
        a.sleep();
//        a.drink();
    }
}