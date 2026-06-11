class Solution {
    public int compress(char[] chars) {
        int read=0;
        int write=0;
        while(read<chars.length){
            char currChar=chars[read];
            int count=0;

            while(read<chars.length&&chars[read]==currChar){
                read++;
                count++;
            }

            chars[write++]=currChar;
            if(count>1){
                String countChar=String.valueOf(count);
                for(char c: countChar.toCharArray()){
                    chars[write++]=c;
                }
            }
        }    
        return write;
    }
}