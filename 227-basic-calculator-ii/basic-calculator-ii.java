class Solution {
    public int calculate(String s) {
        Stack<Integer> operand=new Stack<>();
        Stack<Character> operation=new Stack<>();
        int i=0;
        char[] st=s.toCharArray();
        while(i<st.length){
            if(st[i]>='0'&&st[i]<='9'){
                int num=0;
                while(i<st.length&&st[i]>='0'&&st[i]<='9'){
                num=num*10+(st[i]-'0');
                i++;
                }
            operand.push(num);
            i--;
            }else if(st[i]=='+'||st[i]=='-'||st[i]=='*'||st[i]=='/'){
                while(operation.size()>0&&prec(operation.peek())>=prec(st[i])){
                    char oper=operation.pop();
                    int val2=operand.pop();
                    int val1=operand.pop();
                    int cal=calcu(val1,val2,oper);
                    operand.push(cal);
                }
                operation.push(st[i]);
            }else{

            }
            i++; 
        }
        while(operation.size()>0){
            char oper=operation.pop();
            int val2=operand.pop();
            int val1=operand.pop();
            int cal=calcu(val1,val2,oper);
            operand.push(cal);
        }
        return operand.pop();
    }
    public int calcu(int val1, int val2, char ch){
        if(ch=='+'){
            return val1+val2;
        }else if(ch=='-'){
            return val1-val2;
        }else if(ch=='*'){
            return val1*val2;
        }else {
            return val1/val2;
        }
    }
    public int prec(char c){
        if(c=='*'|| c=='/'){
            return 1;
        }else {
            return 0;
        }
    }
}