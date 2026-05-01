import java.util.Scanner;
public class Hello {
    public static void main(String [] args){
        System.out.println("Hello World!");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(addCalculator(a,b));
        sc.close();
    }

    public static int addCalculator(int a, int b){
        return a+b;
        }
    public static double addCalculator(double a, double b){
        double add = a+b;
        return add;

    }
    
}
