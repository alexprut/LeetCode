class Solution {
    public boolean checkOnesSegment(String s) {
        char[] ch = s.toCharArray();
        for(int i=0; i<s.length()-1; i++){
            if(ch[i+1] == '1' && ch[i] == '0'){
                return false;
            }
        }
        return true;
    }
}