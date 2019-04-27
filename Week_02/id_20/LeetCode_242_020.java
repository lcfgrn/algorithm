class Solution {
    public boolean isAnagram(String s, String t) {
            if(s==null||t==null || s.length()!=t.length()){
                return false;
            }

            int[] counter = new int[26];
            //此时s和t的长度一致，所以对两个String的遍历可以合并
            for (int i = 0; i < s.length(); i++) {
                counter[s.charAt(i) - 'a'] ++;
                counter[t.charAt(i) - 'a'] --;
            }
            for (int i = 0; i < counter.length; i++) {
                if (counter[i] != 0) {
                    return false;
                }
            }
            return true;
    }
}
