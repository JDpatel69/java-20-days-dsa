class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> sa = new Stack<>();

        for(String to : tokens){
            if (to.equals("+")||to.equals("*")||
                to.equals("/")||to.equals("-")){
                    int  x = sa.pop();
                    int y= sa.pop();
                    int res=0;
                    if (to.equals("+")) res = x + y;
                    else if(to.equals("*")) res = x * y;
                    else if(to.equals("-")) res = y-x;
                    else res=y/x;

                    sa.push(res);
                }
            else
                    sa.push(Integer.parseInt(to));
            }
        return sa.pop();
    }  
}