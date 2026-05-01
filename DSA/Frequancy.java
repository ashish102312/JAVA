package DSA;

import java.util.HashMap;
import java.util.*;

public class Frequancy {
    public static void main(String[] args){
        int[] arr={1,2,2,3,4,4,4,5,5,5,5};
        HashMap<Integer,Integer> frequancy = new HashMap<>();

        for(int num : arr){
            if(frequancy.containsKey(num)){
                frequancy.put(num,frequancy.get(num)+1);

            }else{
                frequancy.put(num,1);
            }
        }
        System.out.println("number : frequancy ");
        for(Map.Entry<Integer,Integer> entry : frequancy.entrySet()){
            System.out.println(entry.getKey()+ " "+entry.getValue());
        }
    }
}
