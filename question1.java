public class question1 {
    // Create a class named Student that stores a student's name and age.
    // The object must receive these two values at the moment it is created,
    // and a member function must display the stored information.
    static class Student {
        String name;
        int age;

        // Constructor
        Student(String name, int age) {
            this.name = name;
            this.age = age;
        }

        // Member function
        void display() {
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
        }
    }

    public static void main(String[] args) {
        // Object created with name and age
        Student s1 = new Student("Ashish", 21);

        // Display information
        s1.display();
    }
}
