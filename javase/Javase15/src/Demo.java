public class Demo {
    public static void main(String[] args) {


//        MyThread mt = new MyThread("新的线程");
//
//        // 开启新线程
//        mt.start();

        // 第二种方法
        MyRunnable mr = new MyRunnable();
        Thread t = new Thread(mr, "小强");
        t.start();
        // 在主方法中实现for循环
        for (int i = 0; i < 10; i++) {
            System.out.println("main方法线程" + i);

        }
    }
}

// 创建线程有四种方式

// 第一种继承,继承Thread
class MyThread extends Thread{
    public MyThread(String name){
        super(name);
    }
    //重写run方法

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(getName() + "正在执行" + i);

        }
    }
}
// 第二种 实现Runnable接口
class MyRunnable implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + "正在执行" + i);
        }
    }
}
// 第三种 实现Callable接口
// 第四种 使用线程池创建