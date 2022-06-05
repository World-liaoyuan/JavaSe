
// 匿名内容类实现线程创建
public class ThreadDemo3 {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i <10 ; i++) {
                    System.out.println(Thread.currentThread().getName() + "正在执行" + i);

                }
            }
        }, "新的线程").start();

    }
}
