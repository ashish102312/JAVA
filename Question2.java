public class Question2 {
    // create a class named bos that can be initialized in two different ways:without an arugment or with a length. demonstrate 
    // constructor overloading by creating one object with each form and displaying both lengths.
    // requirements ; keep length private , create a default constructor that accepts length, create two object and display their lengths

    static class Box {
        private int length;
        // Default constructor
        Box() {
            length = 0;
        }
        // Parameterized constructor
        Box(int length) {
            this.length = length;
        }
        // Display length
        void display() {
            System.out.println("Length: " + length);
        }
    }

    public static void main(String[] args) {
        // Object using default constructor
        Box b1 = new Box();
        // Object using parameterized constructor
        Box b2 = new Box(10);
        b1.display();
        b2.display();
    }
}
