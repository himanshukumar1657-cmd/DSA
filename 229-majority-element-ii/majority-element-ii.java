class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Map<Integer,Integer> input=new HashMap<>();
        List<Integer> ans=new ArrayList<>();
        for(int i:nums){
             input.put(i, input.getOrDefault(i, 0) + 1);
        }
        int n=nums.length/3;
        for(int j:input.keySet()){
            if(input.get(j)>n){
                ans.add(j);
            }
        }
        return ans;

        
    }
}