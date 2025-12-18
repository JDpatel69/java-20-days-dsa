

public class runningsum {
   
    public static void main(String[] args) {
       
        int[] arr = {1, 2, 2, 3, 1, 4, 2};

            int[] ans = new int[arr.length];

            ans[0]=arr[0];

            for(int i=1;i<arr.length;i++)
            {
                ans[i]=arr[i]+ans[i-1];
            }

            for(int i=0;i<ans.length;i++)
          
           System.out.print(ans[i] + " ");

    
    }
    
}
