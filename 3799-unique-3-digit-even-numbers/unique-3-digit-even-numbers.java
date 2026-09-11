class Solution {
    public int totalNumbers(int[] digits) {
        int count=0;
        for(int num=100;num<=998;num+=2){
            int a=num/100;
            int b=(num/10)%10;
            int c=num%10;
            int[] used=new int[10];
            for(int i=0;i<digits.length;i++){
                used[digits[i]]++;
            }
            if(used[a]>0){
                used[a]--;
                if(used[b]>0){
                    used[b]--;
                    if(used[c]>0){
                        count++;
                    }
                }
            } 
        }           
    return count;
    }
}