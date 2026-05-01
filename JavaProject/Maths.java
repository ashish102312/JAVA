// import java.util.*;
// public class Maths{

//     public static void main(String [] args){
//         Scanner sc = new Scanner(System.in);
//         double a;
//         double b;
//         double c;
//         System.out.println("enter your side a: ");
//         a = sc.nextDouble();
//         System.out.println("enter your side b: ");
//         b = sc.nextDouble();
//         c = Math.sqrt(Math.pow(a, 2)+ Math.pow(b,2));
//         System.out.printf("hypotenuse is : .2f", c);
//         sc.close();

//     }
// }


// compund interest

import java.util.Scanner;
public  class Maths{
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        double p ;
        double r;
        double t;
        double ci;
        System.out.println("enter your principal amount: ");
        p = sc.nextDouble();
        System.out.println("enter your rate of intreset: ");
        r = sc.nextDouble();
        System.out.println("enter your time in years: ");
        t = sc.nextDouble();
        ci = p*Math.pow((1+r/100),t)-p;
        System.out.printf("the total compund interset will be %.2f and for the years is %.2f", ci,t);
    sc.close();
    };
}