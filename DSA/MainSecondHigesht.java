package DSA;
import java.util.ArrayList;

import java.util.Collections;

public class MainSecondHigesht {
    public static void main(String[] args){
        ArrayList <Integer> list = new ArrayList<>();
        list.add(23);
        list.add(45);
        list.add(63);
        list.add(12);
        list.add(343);
        Integer second = findSecondNum(list);
        System.out.println("the second highest number is "+ second);
    }
    public static Integer findSecondNum(ArrayList<Integer> list){
        if(list==null||list.size()<2){
            return null;
                }
        Collections.sort(list,Collections.reverseOrder());
        return list.get(1);
    }

}
