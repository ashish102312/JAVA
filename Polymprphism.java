// public class Polymprphism {
//     public static void main(String[] args) {

//         SchoolPeople sp = new SchoolPeople();// no polymorphism
//         sp.role();

//         SchoolPeople s = new Student();//polymorphism //upcasting: it is more safe .
//         SchoolPeople t = new Teacher();//polymorphism
//         SchoolPeople w = new Worker();//polymorphism

//         //1
//         // Student xyz = (Student)s;//downcasting: it can only created after upcasting.
//         //2
//         // SchoolPeople sp = new SchoolPeople();//create new
//         //faclity f = (faclity)sp;// than downcasting it.
//         s.role();
//         t.role();
//         w.role();
//     }
// }

// class SchoolPeople {
//     void role() {
//         System.out.println("They came to do their job");
//     }
// }

// class Student extends SchoolPeople {
//     @Override
//     void role() {
//         System.out.println("They came to study");
//     }
// }

// class Teacher extends SchoolPeople {
//     @Override
//     void role() {
//         System.out.println("They came to teach");
//     }
// }

// class Worker extends SchoolPeople {
//     @Override
//     void role() {
//         System.out.println("They came to cleaning or take care of others etc");
//     }
// }
//polyorphism (static binding),.
//downcasting

// public class Polymprphism {

//     public  static void main(String[] args){
//         SchoolPeople c1 = new Student();
//         SchoolPeople c2 = new SchoolPeople();
//         c1.role();
//         c2.role();
//         if(c1 instanceof Student){
//             Student f1 = (Student)c1;
//             System.out.println("ca is faclity"+
//             f1);
//         }
//         else if(c2 instanceof Student){
//             Student f2 = (Student)c2;
//             System.out.println("c2 is faclity"+
//             f2);
//         }else{
//             System.out.println("c2 is just a SchoolPeople");
//         }
//     }

// class SchoolPeople {
//     void role() {
//         System.out.println("They came to do their job");
//     }
// }

// class Student extends SchoolPeople {
//     @Override
//     void role() {
//         System.out.println("They came to study");
//     }
// }
// }