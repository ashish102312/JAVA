//class is the buleprint or object is the instance of class
// eg : i want to installl software in the system, it is my class , and the going to download(implemets) the software is my object of class

public class CO{
    public static void main(String[] args){
        Dog Dogesh = new Dog("swimming");
        Dogesh.breed="Instdogesh";
        Dogesh.age=4;
        System.out.println("the dos breed is "+Dogesh.breed+"and the age is "+Dogesh.age);
    }

}
class Dog{
    String breed = "!!Enter the value!!";
    int age;
    Dog(String habit){
        habit="dance";
    }
}
