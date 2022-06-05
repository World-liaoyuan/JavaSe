class Fu {
    // Fu中的成员变量。
    private int num = 3;
}

class Zi extends Fu {
    // Zi中的成员变量
    int num = 4;
    public void show() {
        // 访问的num到底是子类还是父类？
        System.out.println("num = " + num);

    }
}
class ExtendsDemo03 {
    public static void main(String[] args) {
        // 创建子类对象
        Zi z = new Zi();
        // 调用子类中的show方法
        z.show();
    }
}
