import java.util.Scanner;

// ɨ����

public class Var{

    public static void main(String[] args) {
        // ��ʾ�����û�������
        // ����
        // 1.����Scanner�İ�
        // 2.����Scanner����
        // 3.�����û�������

        Scanner myScanner = new Scanner(System.in);
        System.out.println("����������");
        String name = myScanner.next();
        System.out.println("���������䣺");
        int age = myScanner.nextInt();
        System.out.println("������нˮ��");
        double sal = myScanner.nextDouble();
        System.out.println("�˵���Ϣ���£�");

        System.out.println("name=" + name + " age=" + age + " sal=" + sal);


    }
}