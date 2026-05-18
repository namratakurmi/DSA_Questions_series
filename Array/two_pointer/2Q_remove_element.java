  // remove the given value from arrya 
class Solution {
    public int removeElement(int[] nums, int val) {
        int i=0;
        int count =0;
        int j= nums.length-1;
       while(i<=j){
            if(nums[i]==val){
                if(nums[j]==val){
                    j--;
                }
                else{
                    int temp = nums[i];
                    nums[i] =nums[j];
                    nums[j] =temp;
                }
            }
            else{
                i++;
                count++;
            }
       }
       return count;
    }
}
