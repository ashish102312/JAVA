public class MainInterFace {

    public static void main(String[] args){
        bike b = new bike();
        b.display();
        b.show();
    }
}

interface ABS{
    String Chategory = "Engine";
    void display();
    default void show(){
        System.out.println(" this is default method");
    }
}
class bike implements ABS{
    @Override
    public void display(){
        System.out.println("this is bike");
    }
}
