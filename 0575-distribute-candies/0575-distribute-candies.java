class Solution {
    public int distributeCandies(int[] candyType) {
        HashSet<Integer> set = new HashSet<>();
        for (int c : candyType) {
            set.add(c);
        }
        int unique = set.size();
        int max = candyType.length / 2;
        return Math.min(unique, max);
    }
}
