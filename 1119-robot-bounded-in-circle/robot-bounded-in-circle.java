class Solution {
    public boolean isRobotBounded(String instructions) {
        int x=0;
        int y=0;
        char direction='N';
        for(int i=0;i<instructions.length();i++){
            char ch=instructions.charAt(i);
            if(ch=='G'){
                if(direction=='N') y++;
                if(direction=='S') y--;
                if(direction=='E') x++;
                if(direction=='W') x--;
            }else if(ch=='L'){
                if(direction=='N') direction='W';
                else if(direction=='S') direction='E';
                else if(direction=='W') direction='S';
                else direction='N';
            }else{
                if(direction=='N') direction='E';
                else if(direction=='S') direction='W';
                else if(direction=='W') direction='N';
                else direction='S';
            }
        }
        return (x==0&&y==0)|| direction!='N';
    }
}