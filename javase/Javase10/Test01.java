import java.util.Arrays;
import java.util.Random;

public class Test01{
    public static void main(String[] args) {

        int[] arr = new int[5];
        System.out.println(arr);
        System.out.println("arr��ʼ״̬" + Arrays.toString(arr));

        Arrays.fill(arr, 3);
        System.out.println("arr���ڵ�״̬:" + Arrays.toString(arr));

        int[] arr2 = Arrays.copyOf(arr, 10);

        System.out.println("������" + Arrays.toString(arr2));
        System.out.println("��������ıȽ�:" + Arrays.equals(arr, arr2));

        Arrays.sort(arr);
        System.out.println("arr�������ڵ�״̬:" + Arrays.toString(arr));

    }
}