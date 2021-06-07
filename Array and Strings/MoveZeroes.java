class Solution {
    public void moveZeroes(int[] nums) {
        int idx = 0;
        for(int ele:nums)
        {
            if(ele != 0)
                nums[idx++] = ele;
        }
        while(idx < nums.length){
            nums[idx++] = 0;
        }
    }
}