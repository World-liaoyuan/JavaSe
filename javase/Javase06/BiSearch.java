public class BiSearch{
    public static void main(String[] args) {

        int[] arr = {2,5,7,8,10,15,18,20,22,25,28};//�����������
        int value = 18;


        int index = -1;
        int left = 0;
        int right = arr.length - 1;

        int mid = (left + right) / 2;

        while (left <= right){
            if (value == arr[mid]){
                index = mid;
                break;
            } else if (value > arr[mid]){
                left = mid + 1;
            } else if (value < arr[mid]){
                right = mid - 1;
            }
            mid = (left + right) / 2;
        }
        if(index == -1){
            System.out.println("������" + value);
        } else {
            System.out.println("����" + value + "�±�" + index);
        }
    }
}