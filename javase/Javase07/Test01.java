class Account{
    String id;
    double balance;

    public void save(double money){
        if (money > 0){
            balance += money;
        } else {
            System.out.println("参数有误");
        }
    }

    public void withdraw(double money){
        if (money < 0){
            System.out.println("参数有误");
        } else if (money > balance){
            System.out.println("余额不足");
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
        // 创建客户对象
        Customer c = new Customer();
        c.name = "金先生";
        c.tel= "10086";
        c.cid = "11111";

        // 创建银行卡对象
        Account a = new Account();
        a.id = "123455";
        a.balance = 0;

        // 银行对象
        BankClerk b = new BankClerk();
        b.open(c, a);
        System.out.println("姓名:" + c.name + ",电话" + c.tel + ", 身份证号:" + c.cid + ",账号:" + c.account.id + "余额:" + c.account.balance);

        // 存款
        c.account.save(1000);
        System.out.println("姓名:" + c.name + ",电话" + c.tel + ", 身份证号:" + c.cid + ",账号:" + c.account.id + "余额:" + c.account.balance);

        // 取款
        c.account.withdraw(200);
        System.out.println("姓名:" + c.name + ",电话" + c.tel + ", 身份证号:" + c.cid + ",账号:" + c.account.id + "余额:" + c.account.balance);


    }
}