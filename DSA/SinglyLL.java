
// class Node{
//     // here we create the node class which is used to create the node of the linked list
//     int data;
//     Node next;
//     Node(int data){
//         this.data= data;
//         this.next= null;
//     }
// }
// class SinglyLL{
//     // here we create the singly linked list class which is used to create the linked list
//     private Node head;
//     private Node tail;
//     private int size;
//     SinglyLL(){
//         this.size=0;
//     }
//     // here we create the insertFirst method which is used to insert the node at the first position of the linked list
//     public void insertFirst(int data){
//         Node node = new Node(data);
//         node.next=head;
//         head=node;

//         if(tail==null){
//             tail=head;
//         }
//         size+=1;
//     }
//     // here we create the insertLast method which is used to insert the node at the last position of the linked list
//     public void insertLast(int data){
//         if(tail==null){
//             insertFirst(data);
//             return;
//         }
//         Node node = new Node(data);
//         tail.next=node;
//         tail=node;
//         size+=1;
//     }
//     // here we create the display method which is used to display the linked list
//     public void display(){
//         Node temp = head;
//         while(temp != null){
//             System.out.print(temp.data);
//             temp = temp.next;
//         };
//     }
//     // here we create the deleteFirst method which is used to delete the node at the first position of the linked list
//     public void deleteFirst(){
//         if(head == null){
//             System.out.println("It is already empty");
//         }
//         head= head.next;
//         size -=1;
//     }
//     public Node getSize(int index){
//         Node node = head;
//         for(int i = 0; i<index; i++){
//             node = node.next;
//         }
//         return node;
//     }
//     public void deleteLast(){
//         //if size short the its is empty
//         if(size <= 0){
//             System.out.println("It is already empty");
//         }
//         // check we can get the last node by tarversing the lst we found the second last node and than
//         // we can delete the last node by making the next of second last node to null
//         Node secondLast = getSize(size-2);
//         int val = tail.data;
//         tail = secondLast;
//         tail.next = null;
//         size-=1;
//     }
// // here we delete the the node whose index is given 
//     public void deleteIndex(int index){
     
//         // for add the value first 
//         if(index == 0){
//             deleteFirst();
//             return;
//         }
//         // for add the value enough
//         if(index == size-1){
//             deleteLast();
//             return;
//         }
//         // here we find the the index number than , replace the next value of the pre node with new value ;
//         Node pre = getSize(index-1);
//         pre.next = pre.next.next;
//         size-=1;
//     }

//     //for find the node
//     public Node find(int value){
//         Node node = head;
//         while( node != null){
//             if(node.data == value){
//                 return node;
//             }
//             node = node.next;
//         }
//         return null;
//     }
// }