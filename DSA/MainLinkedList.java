package DSA;

import java.util.*;
public class MainLinkedList {
    public static void main(String[] args){
      LinkedList<String> linkedList = new LinkedList<>();
      System.out.println(linkedList.isEmpty());
      //stack
      linkedList.push("A1");
      linkedList.push("A2");
      linkedList.push("A3");
      linkedList.push("A4");
    //   linkedList.poll();
      
      //queue
      linkedList.offer("B1");
      linkedList.offer("B2");
      linkedList.offer("B3");
      linkedList.offer("B4");
    //   linkedList.pop();
    
     //LinkedList
     linkedList.add(3,"A0");
     linkedList.add(4,"B0");
     linkedList.remove("B0");
     linkedList.remove("A0");
     //searching
      System.out.println(linkedList.peekFirst());
      System.out.println(linkedList.peekLast());
      System.out.println(linkedList.indexOf("A2"));
      System.out.println(linkedList.size());
      //inerstion
      linkedList.addFirst("A5");
      linkedList.addLast("B5");
      //deletion
      String first = linkedList.removeFirst();
      String last = linkedList.removeLast();
      
      System.out.println(linkedList);
    }
}