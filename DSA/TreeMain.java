
public class TreeMain {

    public static void main(String[] args) {

        Tree tree1 = new Tree();

        // Iterative insertion
        tree1.insertIterative(50);
        tree1.insertIterative(30);
        tree1.insertIterative(70);
        tree1.insertIterative(20);
        tree1.insertIterative(40);

        System.out.print("Iterative BST: ");
        tree1.displayIn();
        System.out.println("Search result in tree 1: " + tree1.search(50));

        Tree tree2 = new Tree();

        tree2.insertRecursive(50);
        tree2.insertRecursive(30);
        tree2.insertRecursive(70);
        tree2.insertRecursive(20);
        tree2.insertRecursive(40);

        System.out.print("Recursive BST: ");
        tree2.displayIn();
        System.out.println("Search result for 60: " + tree2.search(60));
    }
}