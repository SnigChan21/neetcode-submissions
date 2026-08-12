class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack=new Stack<>();
        for(String token:tokens){
            if(token.equals("+")){
                int top=stack.pop();
                int newtop=stack.pop();
                stack.push(top+newtop);
            }
            else if(token.equals("-")){
                int top=stack.pop();
                int newtop=stack.pop();
                stack.push(newtop-top);
            }
            else if(token.equals("*")){
                int top=stack.pop();
                int newtop=stack.pop();
                stack.push(top*newtop);
            }
            else if(token.equals("/")){
                int top=stack.pop();
                int newtop=stack.pop();
                stack.push(newtop/top);
            }
            else{
                stack.push(Integer.parseInt(token));
            }
        }
        return stack.pop();
    }
}
