public class BST {
    //searching element there is given 
    public boolean search(int data) {
        return search(root, data);
    }

    private boolean search(Node node, int data) {
        if (node == null) {
            return false;
        }
        if (data == node.data) {
            return true;
        }
        if (data < node.data) {
            return search(node.pleft, data);
        } else {
            return search(node.pright, data);
        }
    }
    // //divide and conquer
    // public int findMin() {
    //     if (root == null) {
    //         throw new IllegalStateException("Tree is empty");
    //     }
    //     return findMin(root);
    // }

    // private int findMin(Node node) {
    //     if (node.pleft == null) {
    //         return node.data;
    //     }
    //     return findMin(node.pleft);
    // }
}
