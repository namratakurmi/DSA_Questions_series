class Solution {
    public int maxArea(int[] height) {
        int i= 0;
        int j= height.length-1;
        int d = height.length-1;
        int w = 0;
        while(i<=j){
            if(height[i]<=height[j]){
                int z = (height[i]*d);
                if(w<=z){
                    w=z;
                }else{
                    w=w;
                }
                i++;d--;
            }
        else{
            int k = (height[j]*d);
                if(w<=k){
                    w=k;
                }
                else{
                    w=w;
                } 
                j--;d--;           
        }}
        return w;
    }
}
