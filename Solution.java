class Solution {
    public String restoreString(String s, int[] indices) {
        char[] ss = s.toCharArray();
        char[] ans = new char[indices.length];
        for (int i = 0; i < indices.length; i++) {
            ans[indices[i]] = ss[i];
        }
        return String.valueOf(ans);
    }
}
