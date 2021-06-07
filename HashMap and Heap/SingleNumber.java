class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        
        for(int i=0;i<nums.length;i++)
        {
            if(hm.containsKey(nums[i]))
                hm.put(nums[i],hm.get(nums[i])+1);
            else
                hm.put(nums[i],1);
            
        }
        int ans=0;
        for(Integer i:hm.keySet())
        {
            if(hm.get(i)==1)
            ans= i;
        }
        return ans;
    }
}