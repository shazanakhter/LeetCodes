class Solution {
    public boolean isValid(String s) {
        Stack<Character> list=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(list.size()==0){
                list.push(s.charAt(i));
            }else if(list.peek()=='('&&s.charAt(i)==')'){
                list.pop();
            }else if(list.peek()=='{'&&s.charAt(i)=='}'){
                list.pop();
            }else if(list.peek()=='['&&s.charAt(i)==']'){
                list.pop();
            }else{
                list.push(s.charAt(i));
            }
        }
        if(list.size()==0){
            return true;
        }
        return false;
    }
}