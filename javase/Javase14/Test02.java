enum Season{
    SPRING("春"), SUMMER("夏"),AUTUMN("秋"),WINTER("冬");
    private String description;

    private Season(String description){
        this.description = description;
    }

    public String toString(){
        return description;
    }
}

public class Test02{
    public static void main(String[] args) {
        Season spring = Season.SPRING;

    }
}