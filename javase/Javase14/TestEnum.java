public class TestEnum {
    public static void main(String[] args) {
        Season spring = Season.SPRING;
        System.out.println(spring);
    }
}
class Season{
    public static final Season SPRING = new Season();
    public static final Season SUMMER = new Season();
    public static final Season AUTUMN = new Season();
    public static final Season WINTER = new Season();

    private Season(){

    }

    public String toString(){
        if(this == SPRING){
            return "��";
        }else if(this == SUMMER){
            return "��";
        }else if(this == AUTUMN){
            return "��";
        }else{
            return "��";
        }
    }
}