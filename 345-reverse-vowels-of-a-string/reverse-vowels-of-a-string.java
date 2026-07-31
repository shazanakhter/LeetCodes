class Solution {
    public String reverseVowels(String s) {
        char[] st=s.toCharArray();
        int n= s.length();
        int start=0;
        int end=n-1;
        while(start<end){
            if((st[start]=='a'||st[start]=='e'||st[start]=='i'||st[start]=='o'||st[start]=='u'||st[start]=='A'||st[start]=='E'||st[start]=='I'||st[start]=='O'||st[start]=='U')&&(st[end]=='a'||st[end]=='e'||st[end]=='i'||st[end]=='o'||st[end]=='u'||st[end]=='A'||st[end]=='E'||st[end]=='I'||st[end]=='O'||st[end]=='U')){
                char temp=st[start];
                st[start]=st[end];
                st[end]=temp;
                start++;
                end--;
            }else if(st[start]=='a'||st[start]=='e'||st[start]=='i'||st[start]=='o'||st[start]=='u'||st[start]=='A'||st[start]=='E'||st[start]=='I'||st[start]=='O'||st[start]=='U'){
                end--;
            }else{
                start++;
            }
        }
        return String.valueOf(st);
    }
}