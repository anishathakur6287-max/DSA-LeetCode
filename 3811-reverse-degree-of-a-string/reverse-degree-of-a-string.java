class Solution {
    public int reverseDegree(String s) {
        int sum=0;
        for(int i=0;i<s.length(); i++){
            char c=s.charAt(i);
            int reverseValue='z'-c+1;
            int position=i+1;
            sum+=reverseValue*position;
        }
        return sum;
    }
}