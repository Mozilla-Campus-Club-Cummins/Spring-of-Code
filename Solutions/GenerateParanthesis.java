class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans=new ArrayList();
        findall("(",1,0,ans,n);
        return ans;

    }

     void findall(String current,int o,int c, List<String> ans,int n)
     {
         if(current.length()==2*n)
         {
            ans.add(current);
            return;
         }

         if(o<n)
            findall(current+"(",o+1,c,ans,n);
        if(c<o)
            findall(current+")",o,c+1,ans,n);
     }
}
