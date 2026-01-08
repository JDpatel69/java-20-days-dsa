// LC 202 - Happy Number
// Approach: HashSet to detect cycle
// Time Complexity: O(log n)
// Space Complexity: O(log n)
class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> hs = new HashSet<Integer>();
       int nnum =n;
       int x =0;
       int sum=0;
        while(nnum!=1){

                while(nnum>0)
                {   x=nnum%10;
                    sum = sum + (x*x);
                    nnum=nnum/10;
                }
                 sum = sum + (nnum*nnum);
                 if(hs.contains(sum)) return false;
                hs.add(sum);
                nnum=sum;
                sum=0;

                
        }
        return true;
    }
}