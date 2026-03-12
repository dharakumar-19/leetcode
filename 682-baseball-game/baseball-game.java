class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer>st=new Stack<>();
        for(String s:operations){
            if(s.equals("C")&& !s.isEmpty()){ st.pop();}
           else if(s.equals("D")&&! s.isEmpty()){ st.push(2*st.peek());}
            else if(s.equals("+")){
                int first=st.pop();
                int second=st.peek();
                int res=first+second;
                st.push(first);
                st.push(res);

            }
            else{st.push(Integer.valueOf(s));}
        }
        int result=0;
        for(int i:st){
            result+=i;
        }
        return result;


        
    }
}