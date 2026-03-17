class Solution {
  
    public void backtrack(List<List<Integer>>res,List<Integer>temp,int[] nums,boolean[]visited){  
        if(temp.size()==nums.length){
            res.add(new ArrayList<>(temp));
        }
        for(int i=0;i<nums.length;i++){
            if(visited[i]){continue;}
            if(i>0&& nums[i]==nums[i-1] && !visited[i-1]){
                continue;

            }
                
                
            
            visited[i]=true;
            temp.add(nums[i]);
            backtrack(res,temp,nums,visited);
            temp.remove(temp.size()-1);
            visited[i]=false;
        }
        }
    
      public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
         List<List<Integer>>res=new ArrayList<>();
        List<Integer>temp=new ArrayList<>();
        boolean[] visited= new boolean[nums.length];
        backtrack(res,temp,nums,visited);
         return res;
    
        
    }
}