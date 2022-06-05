abstract class Animal {
    public abstract void eat();
}

class Cat extends Animal {
    public void eat() {
        System.out.println("吃鱼");
    }
    public void catchMouse(){
        System.out.println("抓老鼠");
    }
}

class Dog extends Animal {
    public void eat() {
        System.out.println("吃骨头");
    }
}

public class Test{
    public static void main(String[] args) {

        Animal a1 = new Cat();
        a1.eat();
//        a1.catchMouse();  // 执行报错, 必须使用子类中的方法

        // 向下转型
        Cat cat = (Cat) a1;
        cat.catchMouse();
    }
}