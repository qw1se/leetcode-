public class Solution {
    public char kthCharacter(int k) {
        StringBuilder sb = new StringBuilder("a");

        int i = 0;
        while (sb.length() < k) {
            int n = sb.length();
            for (int j = 0; j < n; j++) {
                char next = sb.charAt(j) == 'z' ? 'a' : (char)(sb.charAt(j) + 1);
                sb.append(next);
                if (sb.length() >= k) break;
            }
        }

        return sb.charAt(k - 1);
    }
}
