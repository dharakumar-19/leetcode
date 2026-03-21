class Solution {
    public String oddString(String[] words) {
        
        int n = words.length;
        
        int[] diff0 = getDiff(words[0]);
        int[] diff1 = getDiff(words[1]);
        int[] diff2 = getDiff(words[2]);
        
        int[] target;
        
       
        if (equals(diff0, diff1)) {
            target = diff0;
        } else if (equals(diff0, diff2)) {
            return words[1];
        } else {
            return words[0];
        }
        
       
        for (int i = 2; i < n; i++) {
            if (!equals(getDiff(words[i]), target)) {
                return words[i];
            }
        }
        
        return "";
    }
    
    private int[] getDiff(String word) {
        int[] diff = new int[word.length() - 1];
        for (int i = 0; i < word.length() - 1; i++) {
            diff[i] = word.charAt(i + 1) - word.charAt(i);
        }
        return diff;
    }
    
    private boolean equals(int[] a, int[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) return false;
        }
        return true;
    }
}