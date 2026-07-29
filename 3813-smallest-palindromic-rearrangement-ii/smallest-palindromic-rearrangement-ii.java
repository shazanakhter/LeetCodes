class Solution {

    public long nCr(int n, int r, int k){
        r=Math.min(r,n-r);
        long result=1;
        for(int i=1;i<=r;i++){
            result=result*(n-r+i)/i;
            if(result>=k){
                return k;
            }
        }
        return result;
    }
    public String smallestPalindrome(String s, int k) {
        int n=s.length();
        char middle=' ';
        if(n%2==1){
            middle=s.charAt(n/2);
        }
        int[] freq=new int[26];
        int[] halfCount=new int[26];
        
        
        for(int i=0;i<n;i++){
            if(n%2==1&&i==n/2) continue;
            freq[s.charAt(i)-'a']++;
        }
        for(int i=0;i<26;i++){
            halfCount[i]=freq[i]/2;
        }
        StringBuilder halfResult=new StringBuilder();
        for(int i=0;i<n/2;i++){
            boolean placedCharacter=false;
            for(int j=0;j<26;j++){
                if(halfCount[j]>0){
                    halfCount[j]--;
                    long ways=1;
                    int letters=0;
                    for(int c=0;c<26;c++){
                        letters+=halfCount[c];
                    }

                    for(int c=0;c<26;c++){
                        if(halfCount[c]>0){
                            ways*=nCr(letters,halfCount[c],k);
                            letters-=halfCount[c];
                        }

                        if(ways>=k){
                            break;
                        }
                    }
                    if(ways>=k){
                        halfResult.append((char)(j+'a'));
                        placedCharacter=true;
                        break;
                    }
                    k-=ways;
                    halfCount[j]++;
                }
            }

            if(placedCharacter==false){
                return "";
            }
        }
        StringBuilder rev=new StringBuilder(halfResult);
        rev.reverse();
        if(middle!=' '){
            halfResult.append(middle);
        }
        return halfResult.toString() +rev.toString();
    }
}