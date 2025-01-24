class Solution {
    public boolean isValid(String s) {
        Stack<Character> list=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('||s.charAt(i)=='{'||s.charAt(i)=='['){
                list.push(s.charAt(i));
            }else if(!list.isEmpty()&&
            ((list.peek()=='('&&s.charAt(i)==')')||
            (list.peek()=='{'&&s.charAt(i)=='}')||
            (list.peek()=='['&&s.charAt(i)==']'))){
                list.pop();
            }else{
                return false;
            }
        }
        return list.isEmpty();
    }
}