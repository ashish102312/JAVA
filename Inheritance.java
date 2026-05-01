// public class Inheritance {
//     public static void main(String [] args){
//         Male m = new Male();
//         m.maleChar();
//         m.mainChar();
//         Female f = new Female();
//         f.femaleChar();
//     }
//     }
//     class Human{
//        void mainChar(){
//         System.out.println(" hey are humans ");
//        }
//     }
//         class Male extends Human{
//             void maleChar(){
//                 System.out.println("they have small hairs");
//             }

//         }
//         class Female extends Human{
//             void femaleChar(){
//                 System.out.println("they have big hairs");
//             }

// }

// // in method overloading

// import java.lang.reflect.Member;
// import java.util.Scanner;

// public class Inheritance {

//     public static void main(String [] args){
//     college o1 = new college();
//     o1.Members();
//     student s1= new student();
//     s1.Members();
//     teacher t1 = new teacher();
//     t1.Members();
    
        
  
//     }
// }
// class college{
//     void Members(){
//         System.out.println(" they are the member of the college");
       
//     }
// }
// class student extends college{
//     @Override
//     void Members(){
//         System.out.println("yes you are student");
        
//     }
// }
// class teacher extends college{

//     void member(){
//         System.out.println("yes you are Teacher");
       
//     }
// }


// super keyword
public class Inheritance {

    public static void main(String [] args){
        Car c = new Car();
        c.display();
    }
}
class Vechile{
    String type ="bmw";
    void display(){
        System.out.println(" Car");
    }
}
class Car extends Vechile{
    String type = "audi";
    void display(){
         System.out.println(super.type);//acces parent field
         super.display();// call parent method
         System.out.println(this.type);// access child field
    }
}