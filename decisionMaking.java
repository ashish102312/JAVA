// if lese only use for true false 
// import java.util.Scanner;
// public class decisionMaking{
//     public static void main (String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter your marks: ");
//         int marks  = sc.nextInt();
//         if(marks>=90){ System.out.println("grade is a");}
//         else if(marks>=70){System.out.println("grade is b");}
//         else if(marks>=60){System.out.println("grade c ");}
//         else{System.out.println("fail");}
//     };
// }

//switch case
// import java.util.Scanner;

// pubic class decisionMaking{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter the day: ");
//         int day = sc.nextInt();
//         if( day <= 30){
//             int n = (( day % 7));
//         switch(n){
//             case 0:
//                 System.out.println("sunday");
//                 break;
//             case 1:
//                 System.out.println("monday");
//                 break;
//             case 2:
//                 System.out.println("tuesday");
//                 break;
//             case 3:
//                 System.out.println("wednesday");
//                 break;
//             case 4:
//                 System.out.println("thrusday");
//                 break;
//             case 5:
//                 System.out.println("friday");
//                 break;
//             case 6:
//                 System.out.println("saturday");
//                 break;
            
//             default:
//                 System.out.println("not valid : " +day);
                
//         }
//     }else{
//         System.out.println("error");
//     }
//         sc.close();
//     }
// }

// weekend holiday 
// import java.util.Scanner;

// public class decisionMaking{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter the day: ");
//         int day = sc.nextInt();
//         if( day <= 30){
//             int n = (( day % 7));
//         switch(n){
//             case 1:
//             case 2:
//             case 3:
//             case 4:
//             case 5:
//                 System.out.println("working");
//                 break;
//             case 6:
//             case 0:
//                 System.out.println("weekend");
//                 break;
                
//         }
//     }else{
//         System.out.println("error");
//     }
//         sc.close();
//     }
// }

//take input 2 ,area od rectangle
// import java.util.Scanner;
// public class decisionMaking{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int a;
//         int b;
//         System.out.println("input 1");
//         a = sc.nextInt();
       
//         System.out.println("input 3");
//         int c = sc.nextInt();
//         if( a >= 1){
//             System.out.println(" area of cricle is "+ Math.PI*a*a);}
//         else if (b ){
//              System.out.println("input 2");
//         b = sc.nextInt();
//         System.out.println("input 2");
//         b = sc.nextInt();
//         int area = a*b;
//         System.out.println("area is "+area);
//         }
//         else if(c >=3){
//             System.out.println("this the input 3");
//         }
        
//         else{
//             System.out.println("invalid input");
//         }
    
//         sc.close();
//     }
// }

// import java.util.Scanner;
// public class decisionMaking{
//     public static void main(String[] args){
        
//         System.out.println(" enter your number: ");
//         Scanner sc = new Scanner(System.in);
//         String name = sc.nextLine();
//         StringBuilder sb = new StringBuilder(name);
//         sb.reverse();
//         System.out.println(sb.toString());
//         sc.close();
//     }
// }
//. revrese in int
// import java.util.Scanner;
// public class decisionMaking{

//     public static void main(String[] args){
//         //int rev = 0;
//         int rem = 0;
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter a ");
//         int a = sc.nextInt();
//         while(a>0){
//             rem = a%10;// number degit//3210
//             //rev = rem*10+rev;//it will not print 0//321
//             a= a/10;
//             System.out.print(rem);

//         }
//         sc.close();
//     }
// }

//enched switch

public class decisionMaking{
    public static void main(String[] args){
        String day = switch("tusday"){
            case "Monday","tusday","wednusday","thrusday","friday"->"working day";
            case "Sunday","saturday"->"holiday";
            default ->"not a day";
        };
        System.out.println(day);

    }
}