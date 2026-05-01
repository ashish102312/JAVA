package DSA;

import java.util.ArrayList;
import java.util.Iterator;

// public class MainArrayList {
//     public static void main(String[] args){
//         ArrayList<Integer> arrayList = new ArrayList<>();
        
//         arrayList.add(1);
//         arrayList.add(2);
//         arrayList.add(3);
//         arrayList.add(4);
//         arrayList.add(5);
    
//         System.out.println("Array "+arrayList);

//         Iterator<Integer> iterator = arrayList.iterator();
//         while (iterator.hasNext()) {
//             if(iterator.next() %2==0){
//                 iterator.remove();
//             }
            
//         }
//         System.out.println("the array is "+arrayList);
//     }
// }

// java 8
// System.out.println("orignal"+arrayList);
// arrayList.removeIf(n->n%2==0);
// System.out.println("after removing even numbers"+arrayList);
public class MainArrayList {

    public static void main(String[] args){
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);

        System.out.println("This is array : "+arrayList);

        Iterator<Integer> iterator = arrayList.iterator();
        while(iterator.hasNext()){
            if(iterator.next()%2 !=0){
                iterator.remove();
            }
        }
        System.out.println("After removing odd numbers:"+arrayList);
    }
}