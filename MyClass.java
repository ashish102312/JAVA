// normal java class call it in for loop

// public class MyClass {
//     public static void main(String[] args) {
//         SimpleClass[] sc = new SimpleClass[5];
//         for (int i = 0; i < sc.length; i++) {
//             sc[i] = new SimpleClass();
//         }

//         for (SimpleClass s : sc) {
//             s.displayMessage();
//         }

//         // for (int i = 1; i <= 5; i++) {
//         //     System.out.println("Iteration: " + i);
//         // }
//     }
// }
// class SimpleClass {
//     void displayMessage() {
//         System.out.println("Hello from SimpleClass!");
//     }
// }
//enum and there instance variable
// import java.util.Scanner;
// public class MyClass {

//     public static void main(String[] args){

//         // for(Day d : Day.values()){
//         //     System.out.println(d + " : " + d.getDetials());
//         // }
//         //switch case with enum
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter day of week:");
//         String input = sc.nextLine();

//         Day today = Day.MONDAY;
//         switch (today) {
//             case SUNDAY:
//                 System.out.println("Today is Sunday");
//                 break;
//             case MONDAY:
//                 System.out.println("Today is Monday");
//                 break;
//             case TUESDAY:
//                 System.out.println("Today is Tuesday");
//                 break;
//             case WEDNESDAY:
//                 System.out.println("Today is Wednesday");
//                 break;
//             case THURSDAY:
//                 System.out.println("Today is Thursday");
//                 break;
//             case FRIDAY:
//                 System.out.println("Today is Friday");
//                 break;
//             case SATURDAY:
//                 System.out.println("Today is Saturday");
//                 break;
        
//             default:
//                 break;
//         }
//         sc.close();
//     }
// }
// enum Day{
//     SUNDAY("1DAY of week"),
//     MONDAY("2Day of week"),
//     TUESDAY("3Day of week"),
//     WEDNESDAY("4Day of week"),
//     THURSDAY("5Day of week"),
//     FRIDAY("6Day of week"),
//     SATURDAY("7Day of week");

//     private String Detials;

//     Day(String Detials){
//         this.Detials = Detials;
//     }

//     public String getDetials(){
//         return Detials;
//     }
// }

//*Question:*
// Write a Java enum CoffeeSize that stores both the fluid ounces and a string description
// for each size (e.g., SMALL: 8 oz, "Small size").
enum CoffeeSize {
    SMALL( 8, "Small size"),
    MEDIUM(12, "Medium size"),
    LARGE(16, "Large size"),
    EXTRA_LARGE(20, "Extra Large size");

    private final int ounces;
    private final String description;

    CoffeeSize(int ounces, String description) {
        this.ounces = ounces;
        this.description = description;
    }

    public int getOunces() {
        return ounces;
    }

    public String getDescription() {
        return description;
    }
}

public class MyClass {

    public static void main(String[] args){

        for(CoffeeSize size : CoffeeSize.values()){
            System.out.println(size + ": " + size.getOunces() + " oz, \"  " + size.getDescription() + "\"");
        }
    }
}