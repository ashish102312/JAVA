import java.util.Random;
public class random {

    public static  void main(String[]args){
        Random r = new Random();
        for(int i =0; i<1;i++){
            for(int j=0;j<3;j++){
                System.out.print(r.nextInt(10)+" ");
            }
        }
        System.out.println();

    }
}
//2 number
// import java.util.HashMap;
// public class random {

//     HashMap <Integer,Integer> map = new HashMap<>();
//     for(int i=0;i<nums.length;i++){
//         int needed = target - nums[i];
//         if(map.containsKey(needed)){
//             return new int[]{map.get(needed]),i};
//         }
//         map.put(nums[i],i);
//     }
//     return new int[]{};


// }