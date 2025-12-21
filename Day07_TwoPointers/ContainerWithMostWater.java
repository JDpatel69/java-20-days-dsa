public class ContainerWithMostWater{
   
    public static void main(String[] args) {
      
        int[] height = {1, 2, 2, 3, 1, 4, 2};
        int maxarea=0,area=0;
        int left=0;
        int right = (height.length - 1);
       
        while(left<right){
           
            area = (right-left)*(Math.min(height[left], height[right]));
            
            if(area>maxarea)maxarea=area;
            
            if(height[left]<height[right])
               left++;
            else
               right--;

        }

      System.out.println(maxarea);

}
}