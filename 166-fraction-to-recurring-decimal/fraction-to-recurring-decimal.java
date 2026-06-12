class Solution {
    public String fractionToDecimal(int numerator, int denominator) {
        StringBuilder sb=new StringBuilder();
        if(numerator==0) return "0";
        if(numerator<0&& denominator>0||numerator>0 && denominator<0) sb.append("-");
        long num=Math.abs((long) numerator);
        long deno=Math.abs((long) denominator);

        long x= num/deno;
        sb.append(x);

        long rem=num%deno;
        if(rem==0) return sb.toString();

        sb.append(".");

        HashMap<Long,Integer> map=new HashMap<>();

        while(rem!=0){
            if(map.containsKey(rem)){
                int idx=map.get(rem);
                sb.insert(idx,"(");
                sb.append(")");
                break;
            }
            map.put(rem,sb.length());
            rem=rem*10;
            sb.append(rem/deno);
            rem=rem%deno;
        }

        return sb.toString();

    }
}