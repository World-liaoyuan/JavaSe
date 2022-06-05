import java.util.Arrays;
import java.util.Random;

public class Test01{
    public static void main(String[] args) {

        int[] arr = new int[5];
        System.out.println(arr);
        System.out.println("arr初始状态" + Arrays.toString(arr));

        Arrays.fill(arr, 3);
        System.out.println("arr现在的状态:" + Arrays.toString(arr));

        int[] arr2 = Arrays.copyOf(arr, 10);

        System.out.println("新数组" + Arrays.toString(arr2));
        System.out.println("两个数组的比较:" + Arrays.equals(arr, arr2));

        Arrays.sort(arr);
        System.out.println("arr数组现在的状态:" + Arrays.toString(arr));

    }
}