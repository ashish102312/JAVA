// package DSA;
// import java.util.ArrayList;
// import java.util.Collections;

// public class MainMerge {
//     public static void main(String[] args){
//         ArrayList<Integer> list1 = new ArrayList<>();
//         list1.add(1);
//         list1.add(2);
//         list1.add(3);
//         list1.add(4);
//         ArrayList <Integer> list2 = new ArrayList<>();
//         list2.add(5);
//         list2.add(6);
//         list2.add(7);
//         list2.add(8);

//         System.out.println("this list 1: "+list1);
//         System.out.println("this list 2: "+list2);

//         ArrayList<Integer> merge = mergeAndSort(list1,list2);
//         System.out.println("merged and sorted list: "+merge);

//     }
//     public static ArrayList<Integer> mergeAndSort(ArrayList<Integer> list1, ArrayList<Integer> list2){
//         ArrayList<Integer> merge = new ArrayList<>();
//         merge.addAll(list1);
//         merge.addAll(list2);
//         Collections.sort(merge);
//         return merge;
// }
// }