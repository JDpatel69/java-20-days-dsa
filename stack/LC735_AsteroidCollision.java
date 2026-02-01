
class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> sa = new Stack<>();
        for(int i : asteroids){
            boolean ds=false;

            while(!sa.isEmpty() && sa.peek()>0 && i<0 ){

                if(sa.peek()<-i){
                    sa.pop();
                }else if(sa.peek()==-i){
                    sa.pop();
                    ds=true;
                    break;
                }else{
                    ds= true;
                    break;
                }

            }
            if(!ds)
            sa.push(i);
        }

        int[] res = new int[sa.size()];
        for (int i = sa.size() - 1; i >= 0; i--) {
            res[i] = sa.pop();
        }
        return res;
    }
}