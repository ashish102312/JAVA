// PRIMITIVE DATE TYPE : those store vale in memory directly in stack
// public class Main{
//     public static void main(String []args){
//         int a = 5;
//         int b= 10;
//         System.out.println("the sum of this is "+ (a+b));
//     }
// }
// public class Main{
//     public static void main(String[]args){
//         double price = 100.50;
//         double tax = 0.8;
//         double total = price + tax;
//         System.out.println("the bill is "+total);
//     }

// }
// public class Main{
//     public static void main(String[] ags){
//         boolean isStudent = true;
//         boolean isID = false;
//         if(isStudent){
//             System.out.println("your student");
//             if(isID){
//                 System.out.println("you have id also");
//             }else{
//                 System.out.println("you dont have id");
//             };
//         }
//         else {
//             System.out.println("your not student ");
//         }
//     }
// }

// REFRENCE VARIABLE : those store address of object/array/string in heap memory
//STRING IS SERIES OR CHAR ... strings are immutable ... java provide concat method
// public class Main{
//     public static void main (String[] args){
//         String name ="ashish";
//         String backname ="bhardwaj ";
//         System.out.println(" my name is "+ name.concat(" ").concat(backname));
//     }
// }
// public class Main{
//     public static void main (String[] args){

//         String s1 = "ashish";
//         String s2 = "bhrdwaj";
//         String s3 = s1.concat(" ").concat(s2);
//         System.out.println(s3);
//     }
// }

//String builder: mutable string .. more efficient than string class 

// public class Main{
//     public static void main(String[]args){
//         StringBuilder sb = new StringBuilder();
//         int n = 5;
//         for(int i =0; i<n; i++){
//             sb.append(i);
//             System.out.println(sb.toString());
//         }
//     }
// }
//.append() method is used to add text to the end of the StringBuilder object.
//.toString() method is used to convert the StringBuilder object to a regular String for display
// public class Main{
//     public static void main(String [] args){
//         StringBuilder sb = new StringBuilder();
//         sb.append("hello ");
//         sb.append("Ashish").append(" ");
//         sb.append("age: ").append(20).append(" . its is true data");
//         System.out.println(sb.toString());
//     }
// }
//String buffer : it use tocreate muttable string but it is mutli thread saftey . snychronized (thats why it is slower than string builder)
// it overude the .equal()method .
// public class Main{
//     public static void main(String[] args){
//         StringBuffer sb = new StringBuffer();
//         sb.append("ashish ");
//         sb.insert(0,"hello ");
//         System.out.println(sb.toString());

//     }
// }
// string input .
// import java.util.Scanner;
// public class Main{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter your name: ");
//         String name = sc.nextLine();
//         System.out.println(" your name is "+name);
//         System.out.println("Enter your age: ");
//         int age = sc.nextInt();
//         System.out.println(age);
//         sc.close();
//         // reverse
//         StringBuilder sb = new StringBuilder(name);
//         sb.reverse();
//         System.out.println(" your name reverse is   : "+(sb.toString()));
//         //vowels count 
//         int count = 0;
//         String s =name.toLowerCase();
//         for (int i = 0; i<s.length(); i ++){
//             char ch = s.charAt(i);
//             if(ch == 'a'|| ch == 'e'|| ch == 'i'|| ch =='o'|| ch =='u' ){

//                 count++;
                
//             }
//              System.out.println(" these are the vowels in your name:  " +ch+"");

//         } 
       
//         System.out.println("vowel is your name is : "+ count);



//     }
// }
//count words in string
// public class Main{
//     public static void main(String[] args){
//         String s = "Javav is very strong language";
//         String [] words = s.trim().split("\\s+");
//         System.out.println(" word count is: "+words.length);
//     }
// }
// replce space
// public class Main{
//     public static void main(String[] args){
//         String s = "java is very Strong";
//         s= s.replace(" ","");
//         System.out.println(s);
//     }
// }