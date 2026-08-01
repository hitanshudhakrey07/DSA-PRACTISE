class Solution {
    public String makeGood(String s) {
        Stack<Character> st = new Stack<>();
        for(int i =0;i<s.length();i++){
            if(st.size()==0){
                st.push(s.charAt(i));
            }else if(Math.abs(st.peek() - s.charAt(i)) == 32){
                st.pop();
            }else{
                st.push(s.charAt(i));
            }
        }
         StringBuilder ans = new StringBuilder();
        while(st.size()>0){
            ans.append(st.pop());
        }
        return ans.reverse().toString();  
        
    }
}