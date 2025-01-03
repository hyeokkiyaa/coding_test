class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int count = 0;

        int indexG = 0;
        int indexS = 0;

        while (indexG < g.length && indexS < s.length) {
            if (s[indexS] >= g[indexG]) {
                indexG++;
                count++;
            }
            indexS++;
        }

                            
        return count; 
    }
}