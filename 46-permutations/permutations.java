class Solution {
    public void backtrack(List<List<Integer>>res,List<Integer>temp,int[] nums){
        if(temp.size()==nums.length){
            res.add(new ArrayList<>(temp));
        }
        for(int i=0;i<nums.length;i++){
            if(temp.contains(nums[i])){
                continue;
                
            }
            temp.add(nums[i]);
            backtrack(res,temp,nums);
            temp.remove(temp.size()-1);

        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>>res=new ArrayList<>();
        List<Integer>temp=new ArrayList<>();
        backtrack(res,temp,nums);
         return res;
    
        
    }
}