class Solution {
    public int maxVowels(String s, int k) {
        int maxCount = 0, currentCount = 0;
        String vowels = "aeiou";
        for (int i = 0; i < k; i++) {
            if (vowels.indexOf(s.charAt(i)) != -1) {
                currentCount++;
            }
        }
        
        maxCount = currentCount;

        for (int i = k; i < s.length(); i++) {
            if (vowels.indexOf(s.charAt(i)) != -1) currentCount++;
            if (vowels.indexOf(s.charAt(i - k)) != -1) currentCount--;
            
            maxCount = Math.max(maxCount, currentCount);
        }
        
        return maxCount;
    }
}
