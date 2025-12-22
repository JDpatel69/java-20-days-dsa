import java.util.HashMap;

public class SubarraySumEqualsK{
   
    public static void main(String[] args) {
        int k=3;
        int[] nums = {1, 2, 2, 3, 1, 4, 2};
        
        HashMap<Integer,Integer> hs = new  HashMap<Integer,Integer>();
        hs.put(0,1);
        int sum=0;
        int count=0;

         for(int i=0;i<nums.length;i++){
             sum=sum+nums[i];
            int y=sum-k;

             if(hs.containsKey(y)){
             count += hs.get(y);
             

             }

           hs.put(sum, hs.getOrDefault(sum, 0) + 1);

        }
        System.out.println(count);
}
}