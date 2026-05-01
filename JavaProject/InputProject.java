import java.util.Scanner;
public class InputProject{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("enter your  age: ");
        int age = sc.nextInt();
        System.out.println("are you student: (true/false)");
        boolean isStudent = sc.nextBoolean();
        int total =0;
        if(isStudent){
            System.out.println("your sub1 marks: ");
            int sub1 =sc.nextInt();
            System.out.println("your sub2 marks: ");
            int sub2 = sc.nextInt();
            System.out.println("your sub3 marks: ");
            int sub3 = sc.nextInt();
            System.out.println("your sub4 marks: ");
            int sub4 = sc.nextInt();
            System.out.println("your sub5 marks: ");
            int sub5 = sc.nextInt();

            System.out.println("your name is: "+name);
            System.out.println("your age is: "+age);
            total=(sub1+sub2+sub3+sub4+sub5);
            System.out.println("your total percentage is :"+((total/500)*100)+"%");
        }
        else{
            System.out.println("you are not student ");
        }
        int count = 0;
        for(int i =0 ; i<name.length(); i++){
            char ch= Character.toLowerCase(name.charAt(i));
            if( ch =='a'|| ch =='e'|| ch=='i'||ch=='o'|| ch=='u'){
                count++;
            }
        }
        System.out.println("vewol count "+count);
        System.out.println(" your name is :"+name);
        System.out.println("your age is : "+age);

        StringBuilder sb = new StringBuilder(name);
        sb.reverse();
         sc.nextLine();
         System.out.println(" you watn to change your name: ");
         name = sc.nextLine();
         System.out.println(" you new name is : "+ name);
         System.out.println("your names reverse is: "+sb.toString());
         System.out.println("your new details are");
         System.out.println("your age is: "+age);
         
sc.close();
    }
}