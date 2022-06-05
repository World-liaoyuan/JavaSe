/*
 *	练习：趣味折纸
 *
 *	题目：
 *		世界最高山峰是珠穆朗玛峰，它的高度是8844.43米，假如我有一张足够大的纸，它的厚度是0.1毫米。
 *		请问，我折叠多少次，可以折成珠穆朗玛峰的高度?
 */

public class WhileTest01{
    public static void main(String[] args){
        // 定义一个计数器
        int count = 0;

        // 定义纸张厚度
        double paper = 0.1;

        // 定义珠穆朗玛峰的高度
        int zf = 8844430;

        // 因为要反复折叠,但是不知道具体的次数
        while (paper <= zf){
            paper *= 2;

            // 计数器+1
            count++;
        }
        System.out.println("需要折叠:" + count + "次");
    }
}