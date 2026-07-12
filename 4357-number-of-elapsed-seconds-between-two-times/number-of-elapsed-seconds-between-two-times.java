class Solution {
    public int secondsBetweenTimes(String startTime, String endTime) {
        int totalstart=0;
        int totalend=0;
        int start=0;
        int end=0;
        for(int i=0;i<2;i++){
            int tempStart=startTime.charAt(i)-'0';
            int tempEnd=endTime.charAt(i)-'0';
            start=start*10+tempStart;
            end=end*10+tempEnd;
        }
        totalstart=start*3600;
        totalend=end*3600;
        start=0;
        end=0;

        for(int i=3;i<5;i++){
            int tempStart=startTime.charAt(i)-'0';
            int tempEnd=endTime.charAt(i)-'0';
            start=start*10+tempStart;
            end=end*10+tempEnd;
        }
        totalstart+=start*60;
        totalend+=end*60;
        start=0;
        end=0;
        for(int i=6;i<8;i++){
            int tempStart=startTime.charAt(i)-'0';
            int tempEnd=endTime.charAt(i)-'0';
            start=start*10+tempStart;
            end=end*10+tempEnd;
        }
        totalstart+=start;
        totalend+=end;
        System.out.println(totalend+" "+totalstart);
        int diff=totalend-totalstart; 
        return diff;
    }
}