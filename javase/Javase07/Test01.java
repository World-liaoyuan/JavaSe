class Account{
    String id;
    double balance;

    public void save(double money){
        if (money > 0){
            balance += money;
        } else {
            System.out.println("��������");
        }
    }

    public void withdraw(double money){
        if (money < 0){
            System.out.println("��������");
        } else if (money > balance){
            System.out.println("����");
        } else {
            balance -= money;
        }
    }
}

class Customer{
    String name;
    String tel;
    String cid;
    Account account;
}

class BankClerk{
    public void open(Customer c, Account a){
        c.account = a;
    }
}

public class Test01{
    public static void main(String[] args){
        // �����ͻ�����
        Customer c = new Customer();
        c.name = "������";
        c.tel= "10086";
        c.cid = "11111";

        // �������п�����
        Account a = new Account();
        a.id = "123455";
        a.balance = 0;

        // ���ж���
        BankClerk b = new BankClerk();
        b.open(c, a);
        System.out.println("����:" + c.name + ",�绰" + c.tel + ", ���֤��:" + c.cid + ",�˺�:" + c.account.id + "���:" + c.account.balance);

        // ���
        c.account.save(1000);
        System.out.println("����:" + c.name + ",�绰" + c.tel + ", ���֤��:" + c.cid + ",�˺�:" + c.account.id + "���:" + c.account.balance);

        // ȡ��
        c.account.withdraw(200);
        System.out.println("����:" + c.name + ",�绰" + c.tel + ", ���֤��:" + c.cid + ",�˺�:" + c.account.id + "���:" + c.account.balance);


    }
}