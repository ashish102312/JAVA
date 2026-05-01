package DSA;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
public class MainRemoveDuplicate {
    public static void main(String[] args){
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(3);
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(2);
        arrayList.add(4);
        arrayList.add(5);

        LinkedHashSet<Integer> remove = new LinkedHashSet<>(arrayList);
        remove.remove(arrayList);
        ArrayList<Integer> result = new ArrayList<>(remove);
        Collections.sort(result);
        System.out.println("this will the array after removing duplicae and sorted form"+result);
        

    }
}
//hash
