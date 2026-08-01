class Solution {
    public String removeStars(String s) {
        Stack<Character> st = new Stack<>();
        for(int i = 0;i<s.length();i++){
            if( s.charAt(i) >= 'a' && s.charAt(i) <= 'z'){
                st.push(s.charAt(i));
            }
            else if( s.charAt(i) == '*'){
                if(st.size() > 0) st.pop();
            }
        }
          StringBuilder ans = new StringBuilder();
        while(st.size()>0){
            ans.append(st.pop());
        }
        return ans.reverse().toString();    
    }
}