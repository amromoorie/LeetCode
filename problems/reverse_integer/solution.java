class Solution {
    public int reverse(int x) {
        String n = Integer.toString(Math.abs(x));
        
        StringBuilder sb = new StringBuilder(n);
        sb.reverse();
        
        int ans;
        try{
         ans = Integer.parseInt(sb.toString());
        }catch(NumberFormatException e){
            return 0;
        }
        if(x < 0){
            return ans * -1;
        }else {
            return ans;
        }
    }
}