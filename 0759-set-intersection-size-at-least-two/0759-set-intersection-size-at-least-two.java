class Solution {
    public int intersectionSizeTwo(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> 
            a[1] == b[1] ? b[0] - a[0] : a[1] - b[1]
        );

        List<Integer> S = new ArrayList<>();

        for (int[] interval : intervals) {
            int start = interval[0], end = interval[1];
            int count = 0;

            if (!S.isEmpty() && S.get(S.size() - 1) >= start) count++;
            if (S.size() > 1 && S.get(S.size() - 2) >= start) count++;

            if (count == 2) continue;

            if (count == 1) {
                S.add(end);
            } else {
                S.add(end - 1);
                S.add(end);
            }
        }

        return S.size();
    }
}
