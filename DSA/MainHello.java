package DSA;

import java.util.ArrayList;

import java.util.Collections;

public class MainHello {
    public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        
        System.out.println("Original: " + list);
        reverseArrayList(list);
        System.out.println("Reversed: " + list);
    }
    public static void reverseArrayList(ArrayList<Integer> list){
        Collections.reverse(list);
    }
    //with collections
        // reverseTwoPointer(list);
        // System.out.println("Reversed: " + list);
}
    //     public static void reverseTwoPointer(ArrayList<Integer> list) {
    //     int left = 0;
    //     int right = list.size() - 1;
        
    //     while (left < right) {
    //         // Swap elements
    //         Integer temp = list.get(left);
    //         list.set(left, list.get(right));
    //         list.set(right, temp);
            
    //         left++;
    //         right--;
    //     }
    // }

