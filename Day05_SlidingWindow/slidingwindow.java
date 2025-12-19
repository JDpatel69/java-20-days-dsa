

public class slidingwindow {
   
    public static void main(String[] args) {
       int k=4;
        int[] nums = {1, 2, 2, 3, 1, 4, 2};

        double sum=0;
           for(int i=0;i<k;i++)
        {   
            sum+=nums[i];
        }
        double max=sum;
        for(int j=k;j<nums.length;j++)
        {
                sum = sum - nums[j - k] + nums[j];
         if(max<sum)
         max=sum;
           
        }
           System.out.println(max/k); 
        
    }
}

    
