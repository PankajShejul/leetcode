class Solution {
    public int compress(char[] chars) {
        int write = 0;

        for (int i = 0; i < chars.length;) {
            char c = chars[i];
            int count = 0;

            while (i < chars.length && chars[i] == c) {
                count++;
                i++;
            }

            chars[write++] = c;

            if (count > 1) {
                for (char digit : String.valueOf(count).toCharArray()) {
                    chars[write++] = digit;
                }
            }
        }

        return write;
        
    }
}