import java.util.Scanner;

public class Test07{
    public static void main(String[] args){
        int temp;
        String name = null;
        String passwd = null;

        do{
            System.out.println("��ӭ�����й�� 1 ע�� 2 ��¼ 3 �˳�");
            Scanner sc = new Scanner(System.in);
            temp = sc.nextInt();

            if (temp == 1){
                System.out.println("��ӭ����ע��ҳ��:");
                System.out.println("�������û���������:");
                Scanner sc1 = new Scanner(System.in);
                name = sc1.next();
                passwd = sc1.next();
                System.out.println("ע��ɹ�!");
            }

            if (temp == 2){
                System.out.println("��ӭ������¼ҳ��:");
                System.out.println("�������û���������:");
                Scanner sc2 = new Scanner(System.in);
                String nameNew = sc2.next();
                String passwdNew = sc2.next();
                if (name.equals(nameNew) && passwd.equals(passwdNew)){
                    System.out.println("��¼�ɹ�!");
                } else {
                    System.out.println("�û������������");
                }

            }
            if (temp == 3){
                System.out.println("ȷ��Ҫ�˳���?");
                Scanner sc3 = new Scanner(System.in);
                String quit = sc3.next();
                if(quit.equals("y")){
                    break;
                }

            }


        } while(true);





    }
}