// package DSA;
// // import java.util.Scanner;
// // public class Hello {
// //     public static void main(String [] args){
// //         System.out.println("Hello World!");
// //         Scanner sc = new Scanner(System.in);
// //         int a = sc.nextInt();
// //         int b = sc.nextInt();
// //         System.out.println(addCalculator(a,b));
// //         sc.close();
// //     }

// //     public static int addCalculator(int a, int b){
// //         return a+b;
// //         }
// //     public static double addCalculator(double a, double b){
// //         double add = a+b;
// //         return add;

// //     }
    
// // }

// //find the freq of charcter in string using hashmap how many alphabet is repeated in string
// import java.util.HashMap;
// import java.util.Scanner;
// public class Hello{
//     public static void main(String[] args){
//         // String str = "aashiiishhh";
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter you name: ");
//         String str1 = sc.nextLine();

//         HashMap<Character,Integer> name = new HashMap<>();
//         //convert string in aray
//         for(char ch: str1.toCharArray()){
//             //find the freq is exist in bucket
//             if(name.containsKey(ch)){
//                 //now add if they comes agian
//                 name.put(ch,name.get(ch)+1);
//             }else{
//                 name.put(ch,1);
//             }
//         }
//         System.out.println(name);

//     }
// }
