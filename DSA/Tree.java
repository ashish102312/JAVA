class Node {

    int data;
    Node pleft;
    Node pright;

    Node(int data) {
        this.data = data;
        this.pleft = null;
        this.pright = null;
    }
}

class Tree {

    private Node root;
    private int size;

    Tree() {
        root = null;
        size = 0;
    }
    // Iterative BST Insert
    public void insertIterative(int data) {

        Node node = new Node(data);

        if (root == null) {
            root = node;
            size++;
            return;
        }

        Node temp = root;

        while (true) {

            if (data < temp.data) {

                if (temp.pleft == null) {
                    temp.pleft = node;
                    size++;
                    return;
                }

                temp = temp.pleft;

            } else {

                if (temp.pright == null) {
                    temp.pright = node;
                    size++;
                    return;
                }

                temp = temp.pright;
            }
        }
    }
    // Recursive BST Insert
    
    public void insertRecursive(int data) {
        root = insert(root, data);
    }

    private Node insert(Node root, int data) {

        if (root == null) {
            size++;
            return new Node(data);
        }

        if (data < root.data) {
            root.pleft = insert(root.pleft, data);
        } else {
            root.pright = insert(root.pright, data);
        }

        return root;
    }
    //searching element there is given
    public boolean search(int data) {
        return search(root, data);
    }

    private boolean search(Node root, int data) {
        if (root == null) {
            return false;
        }
        if (data == root.data) {
            return true;
        }
        if (data < root.data) {
            return search(root.pleft, data);
        } else {
            return search(root.pright, data);
        }
    }

    // Inorder Traversal
    public void displayIn() {
        displayInorder();
    }

    public void displayInorder() {
        displayInorder(root);
        System.out.println();
    }

    private void displayInorder(Node node) {
        if (node == null)
            return;
        displayInorder(node.pleft);
        System.out.print(node.data + " ");
        displayInorder(node.pright);
    }

    // Preorder Traversal
    public void displayPreorder() {
        displayPreorder(root);
        System.out.println();
    }

    private void displayPreorder(Node node) {
        if (node == null)
            return;
        System.out.print(node.data + " ");
        displayPreorder(node.pleft);
        displayPreorder(node.pright);
    }

    // Postorder Traversal
    public void displayPostorder() {
        displayPostorder(root);
        System.out.println();
    }

    private void displayPostorder(Node node) {
        if (node == null)
            return;
        displayPostorder(node.pleft);
        displayPostorder(node.pright);
        System.out.print(node.data + " ");
    }

    // preorder traversal
    public void insertPre(int data) {
        root = insertPre(root, data);
    }

    private Node insertPre(Node root, int data) {

        if (root == null) {
            size++;
            return new Node(data);
        }

        if (data < root.data) {
            root.pleft = insertPre(root.pleft, data);
        } else {
            root.pright = insertPre(root.pright, data);
        }

        return root;
    }

    private void display(Node node) {

        if (node == null)
            return;
        display(node.pleft);
        System.out.print(node.data + " ");
        display(node.pright);
    }
    public int getSize() {
        return size;
    }
}