class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> st = new Stack<>();
        for(int i = 0;i<s.length();i++){
            if( s.charAt(i) >= 'a' && s.charAt(i) <= 'z'){
                st.push(s.charAt(i));
            }
            else if( s.charAt(i) == '#'){
                if(st.size() > 0) st.pop();
            }
        }
        Stack<Character> st1 = new Stack<>();
        for(int i = 0;i<t.length();i++){
            if( t.charAt(i) >= 'a' && t.charAt(i) <= 'z'){
                st1.push(t.charAt(i));
            }
            else if( t.charAt(i) == '#'){
                if(st1.size() > 0) st1.pop();
            }
        }
        return st.equals(st1);
    }
}