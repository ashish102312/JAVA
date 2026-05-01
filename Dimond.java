public class Dimond {
    public static void main(String[] args){
        Greeting newWay = (name)->System.out.println("hi "+name);
        newWay.sayHello("ashish");
        Greeting new1Way = (age)->System.out.println("this is my age "+age);
        new1Way.sayHello("21");
    }
}
interface Greeting{
    void sayHello(String name);
}
class new1Way implements Greeting{
    @Override
    public void sayHello(String age){
        System.out.println("hello "+age);
    }
}
