class Solution {
    public String longestNiceSubstring(String s) {
        if(s.length()<2)
        return "";
        Set<Character> set= new HashSet<>();
        char []arr= s.toCharArray();
        for(char ch: arr)
        set.add(ch);
        for(int i=0; i<arr.length; i++){
            char ch= arr[i];
            if(set.contains(Character.toUpperCase(ch)) && set.contains(Character.toLowerCase(ch)))
            continue;
            String s1= longestNiceSubstring(s.substring(0,i));
            String s2= longestNiceSubstring(s.substring(i+1));
            return s1.length()>=s2.length()?s1:s2;
        }
        return s;
    }
}
