import java.util.*;

public class CRM{
    public static void main(String[] args) {

        CustomerView cv = new CustomerView();
        cv.enterMainMenu();
        
    }

}

class CustomerView{
    CustomerList customers = new CustomerList(10);
    int temp;
    Scanner sc = new Scanner(System.in);

    public void enterMainMenu(){
        boolean flag = true;
        do {
            System.out.println("-----------客户信息管理软件-----------");
            System.out.println("\t\t\t1添加用户");
            System.out.println("\t\t\t2修改用户");
            System.out.println("\t\t\t3删除用户");
            System.out.println("\t\t\t4客户列表");
            System.out.println("\t\t\t5退   出");
            System.out.println("请选择(1-5):_");

            temp = sc.nextInt();
            switch (temp){
                case 1:
                    addNewCustomer();
                    break;

                case 2:
                    modifyCustomer();
                    break;
                case 3:
                    deleteCustomer();
                    break;
                case 4:
                    listAllCustomers();
                    break;
                case 5:
                    System.out.println("欢迎使用,再见!");
                    flag = false;
                    break;

            }

        } while (flag);


    }

    private void addNewCustomer(){
        System.out.println("-----------添加客户-----------");
        Customer cu = new Customer();
        System.out.print("姓名:");
        cu.setName(sc.next());
        System.out.print("性别:");
        cu.setGender(sc.next());
        System.out.print("年龄:");
        cu.setAge(sc.nextInt());
        System.out.print("电话:");
        cu.setPhone(sc.next());
        System.out.print("邮箱:");
        cu.setEmail(sc.next());

        customers.addCustomer(cu);
        System.out.println("添加成功");
    }

    private void modifyCustomer(){

    }

    private void deleteCustomer(){

    }

    private void listAllCustomers(){
        System.out.println("-----------客户列表-----------");
        for (int i = 0; i < customers.indexTemp; i++){
            System.out.println(customers.customers[i].getInfo());

        }

    }




}

class CustomerList{
    Customer[] customers;
    int total = 0;
    int indexTemp = 0;

    public  CustomerList(int totalCustomer){
        customers = new Customer[totalCustomer];
    }

    public boolean addCustomer(Customer customer){
        customers[indexTemp] = customer;
        indexTemp++;
        return true;

    }

    public boolean replaceCustomer(int index, Customer cust){
        customers[index] = cust;
        return true;
    }

    public  Customer[] getAllCustomers(){
        return customers;
    }

    public Customer getCustomer(int index){
        return customers[index];
    }


}

class Customer{
    private int id;
    private String name;
    private String gender;
    int age;
    private String phone;
    private String email;

    public String getInfo(){
        return "id" + id + "姓名:" + name + "性别:" + gender + "年龄:" + age + "电话:" + phone + "邮箱:" + email + "\n";
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}