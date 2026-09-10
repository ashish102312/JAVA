// // package DSA;
// // import java.util.HashSet;
// // public class MainHashSet {
// //     public static void main(String[] args){
// //         HashSet<Integer> set = new HashSet<>();
// //         set.add(1);
// //         set.add(2);
// //         set.add(3);
// //         set.add(3);
// //         set.add(5);
// //         set.add(null);
// //         System.out.println("this is hashset: "+set);
// //         if(set.contains(3)){
// //             System.out.println("set contains 3");
// //         }
// //         set.remove(2);
// //         System.out.println(set);
// //         System.out.println(set.size());

// //     }
// // }


// package DSA;
// import java.util.HashSet;

// // public class MainHashSet {

// //     public static void main(String[] args){
// //         HashSet<String> set = new HashSet<>();
// //         set.add("apple");
// //         set.add("banana");
// //         set.add("orange");
// //         set.add("banana");
// //         set.add("banana");
// //         set.add(null);
// //         System.out.println("HashSet: " + set);
// //     }
// // }
// // commoan element in 2 hash set

// // public class MainCommonElement {
// //     public static void main(String[] args){
// //         HashSet<Integer> set1 = new HashSet<>();
// //         set1.add(1);
// //         set1.add(2);
// //         set1.add(3);
// //         set1.add(4);

// //         HashSet<Integer> set2 = new HashSet<>();
// //         set2.add(3);
// //         set2.add(4);
// //         set2.add(5);
// //         set2.add(6);
// //         if(set1.size() == set2.size()){
// //             System.out.println("yes the are common");
// //         }else{
// //             System.out.println("they are not");
// //         }

// //         for(int i = 1; i<=6; i++){
// //             if(set1.contains(i) && set2.contains(i)){
// //                 System.out.println("Common element: "+i);
// //             }
            
// //         }
// //     }
// // }
// //find the missing number 1 to n
// // public class MainCommonElement {

// //     public static void main(String[] args){
// //         HashSet <Integer> set = new HashSet<>();
// //         set.add(1);
// //         set.add(2);
// //         set.add(4);
// //         set.add(5);
// //         set.add(9);
// //         set.add(6);
// //         set.add(7);
// //         int n = 9;
// //         for(int i = 1; i<=n; i++ ){
// //             if(!set.contains(i)){
// //                 System.out.println(i);
// //             }

// //         }
// //      }
// // }
// //Check if array elements are consecutive
// import java.util.*;
// public class Main{
//     public static void main(String[] args){
//         int[] arr ={5,2,3,1,4};
//         if(isConsecutive(arr)){
//             System.out.println("they are consecutive");
//         }else{
//             System.out.println("they are not consecutive");
//         }
//     }public static boolean isConsecutive(int[] arr){
//         if(arr.length==0){
//             return false;
//         }
//         Arrays.sort(arr);
        
//         for(int i = 0; i<arr.length-1;i++){
//             if(arr[i+1]!=arr[i]+1){
//                 return false;
//             }
//         }
//         return true;
//     }
// }

// // }
// //  Count distinct pairs with given sum
// // int[] arr = {1, 5, 7, -1, 5};
// // int sum = 6;
// // Expected Output:
// // 3
// // public class Main {

// //     public static void main(String[] args){
// //         HashSet<Integer> set =new HashSet<>();
// //         int[] arr ={1,5,7,-1,5};
// //         int count=0;
// //         int sum = 6;
// //         for(int i = 0; i<arr.length;i++){
// //                 for(int j =i+1;j<arr.length;j++){
// //                     if(arr[i]+arr[j]==sum){
// //                         count++;

// //                     }
// //                 }
// //         }
// //         System.out.println(count);
// //     }
// // }
// //13. Remove consecutive duplicate elements
// // ArrayList<Integer> list = new ArrayList<>(List.of(1,1,2,2,3,1));
// // Expected Output: [1,2,3,1]
// // import java.util.*;
// // public class Main {

// //     public static void main(String[] args){
// //         ArrayList<Integer> list = new ArrayList<>();
// //         list.add(1);
// //         list.add(1);
// //         list.add(2);
// //         list.add(2);
// //         list.add(3);
// //         list.add(1);

// //         System.out.println("origal list"+list);
// //         removingConsecutive(list);
// //         System.out.println("thie is the list"+list);
// //     }
// //     public static void removingConsecutive(ArrayList<Integer> list){
// //         for(int i = list.size()-1;i>0;i--){
// //             if(list.get(i)==list.get(i-1)){
// //                 list.remove(i);
// //             }
// //         }
// //     }
// // }