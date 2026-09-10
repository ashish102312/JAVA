class Node{
    //creation of double linked list node class which is used to create the node of the linked list 
    int data;
    Node next;
    Node prev;
    Node(int data){
        this.data= data;
        this.next= null;
        this.prev= null;
    }
}


class DoubleLL {
    //private so that no one can acces it outside
    private Node head;
    private Node tail;
    private int size;
    DoubleLL(){
        this.size=0;
    }
    public void iFirst(int data){
    Node node = new Node(data);

    if(head == null){
        head = node;
        tail = node;
    }else{
        node.next = head;
        head.prev = node;
        head = node;
    }
    size++;
}
    public void iLast(int data){
    Node node = new Node(data);

    if(head == null){
        head = node;
        tail = node;
        size++;
        return;
    }
    tail.next = node;
    node.prev = tail;
    tail = node;
    size++;
    }
    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

}
