// empty constructor
// public class constructor{
//     public static void main(String[] args){
//         Dog Dogesh = new Dog();
//         Dogesh.breed="Instdogesh";
//         Dogesh.age=4;
//         //override
//         Dogesh.habit="Swimming";

//         System.out.println(Dogesh.habit);
//         System.out.println("the dos breed is "+Dogesh.breed+"and the age is "+Dogesh.age);
//     }

// }
// class Dog{
//     String breed = "!!Enter the value!!";
//     int age;
//     String habit;
//     Dog(){
//         //null
//         //habit="dance";
//         this.habit="dance";
//     }
// }
// public class constructor{
//     public static void main(String[] args){
//         //1 object
//         Dog Dogesh = new Dog("labour",6);
//         Dogesh.breed="Instdogesh";
//         Dogesh.age=4;
//         System.out.println("the dos breed is "+Dogesh.breed+"and the age is "+Dogesh.age);
//        //2 oject
//         Dog Bunty = new Dog("husky",4);
//         System.out.println("this new dog "+Bunty.breed+" and his age is "+Bunty.age);

//     }

// }
// class Dog{
//     String breed = "!!Enter the value!!";
//     int age;
//     Dog(String b,int a){// constuctor
//         this.breed = b;
//         this.age =a;
//     }
// }


// method chaining: multiple methods in same class or one statement
// public class constructor {

//     public static void main(String[] args){
//          Car c1 = new Car()
//          .myCar("tayota")
//          .year(2022);
//          c1.display();
//     }
// }
//     class Car{

//         String make;
//         int year;
//     //method 1
//      Car myCar(String make){
//         this.make=make;
//         return this;
//     }
//     //method 2
//     Car year(int year){
//         this.year = year;
//         return this;
//     }
//     void display(){
//         System.out.println("this is my car"+make+" and the year is "+year);
//     }
// }
   



// inheritance

public class constructor {

    public static void main(String [] args){
        Male m = new Male();
        m.maleChar();
        m.mainChar();
        Female f = new Female();
        f.femaleChar();
    }
    }
    class Human{
       void mainChar(){
        System.out.println(" hey are humans ");
       }
    }
        class Male extends Human{
            void maleChar(){
                System.out.println("they have small hairs");
            }

        }
        class Female extends Human{
            void femaleChar(){
                System.out.println("they have big hairs");
            }

        }
    
