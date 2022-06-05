public class GenDemo {
    public static void main(String[] args) {
        CompareData compareData = new CompareData(1, 2);
//        CompareData<Integer> com1 = new CompareData<Integer>("ab", 12);

        CompareData<Double> com2 = new CompareData<Double>(12.3, 23.3);
    }




}


// 泛型类
class CompareData<T>{
    // 定义T类型属性
    private T a;
    private T b;

    public CompareData(T a, T b){
        int a1 = (Integer)a;
        int b1 = (Integer)b;
        System.out.println(a1 + b1);
    }
}