class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer>temp=new ArrayList<>();
        backtrack(candidates,target,res,temp,0);
        return res;

        
    }
    void backtrack(int[] candidates,int target,List<List<Integer>> res,List<Integer>temp,int start){
        if(target==0){
            res.add(new ArrayList<>(temp));
            return;
        }
        if(target<0){
            return;
        }
        for(int i=start;i<candidates.length;i++){
            temp.add(candidates[i]);
            target=target-candidates[i];
            backtrack(candidates,target,res,temp,i);
            target=target+candidates[i];
            temp.remove(temp.size()-1);

        }
        
    }
}