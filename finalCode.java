public class finalCode {
    // create studetn with private marks m1, m2, m3
    // use a parameterized constructor to initialize marks create average() to calcultate the average create display() to. print it
    //identify constructor encapsulation and abstraction in your solution

    // Private data members → Encapsulation
    private int m1;
    private int m2;
    private int m3;

    // Parameterized Constructor
    public finalCode(int m1, int m2, int m3) {
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
    }

    // Method to calculate average
    public double average() {
        return (m1 + m2 + m3) / 3.0;
    }

    // Method to display student details
    public void display() {
        System.out.println("Marks 1: " + m1);
        System.out.println("Marks 2: " + m2);
        System.out.println("Marks 3: " + m3);
        System.out.println("Average: " + average());
    }

    public static void main(String[] args) {

        // Creating object using parameterized constructor
        finalCode student = new finalCode(80, 90, 85);

        student.display();
    
}
}
