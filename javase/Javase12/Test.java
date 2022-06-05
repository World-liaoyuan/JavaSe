abstract class Animal {
    public abstract void eat();
}

class Cat extends Animal {
    public void eat() {
        System.out.println("����");
    }
    public void catchMouse(){
        System.out.println("ץ����");
    }
}

class Dog extends Animal {
    public void eat() {
        System.out.println("�Թ�ͷ");
    }
}

public class Test{
    public static void main(String[] args) {

        Animal a1 = new Cat();
        a1.eat();
//        a1.catchMouse();  // ִ�б���, ����ʹ�������еķ���

        // ����ת��
        Cat cat = (Cat) a1;
        cat.catchMouse();
    }
}