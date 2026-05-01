public class overloading {
    public static void main(String[] args){
        System.out.println(add());
        System.out.println(add(1));
        System.out.println(add(2,3));
        System.out.println(add(1,2,3.45));
    }
    //1
    public static int add(){
        System.out.println("hello");
        return 0;
    }
    //2
    public static int add( int a){
        System.out.println("hello");
        return 1;
    }
    //3
    public static int add(int a, int b){
        return a+b;
    }
    //4
    public static int add(int a, int b, double c){
        return a+b+(int)c;// doing type casting to convert double to int
    }
}
