interface LiveAble{
    //������󷽷�
    public abstract void eat();

    // ����Ĭ�Ϸ���
    public default void sleep(){
        System.out.println("��ֹ����");
    }

    // ���徲̬����
    public static void drink(){
        System.out.println("��ˮ");
    }
}

class Animal implements LiveAble{


    @java.lang.Override
    public void eat() {
        System.out.println("�Զ���");
    }

    // ��дĬ�Ϸ���
    public void sleep(){
        System.out.println("�����۾�˯��");
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