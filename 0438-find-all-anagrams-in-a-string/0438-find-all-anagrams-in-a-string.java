class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new ArrayList<>();

        int[] pcount = new int[26];
        int[] scount = new int[26];

        int i = 0;
        int j = 0;

        for (int k = 0; k < p.length(); k++) {
            pcount[p.charAt(k) - 'a']++;
        }

        while (j < s.length()) {
            scount[s.charAt(j) - 'a']++;

            if (j - i + 1 > p.length()) {
                scount[s.charAt(i) - 'a']--;
                i++;
            }

            if (j - i + 1 == p.length()) {
                if (Arrays.equals(pcount, scount)) {
                    list.add(i);
                }
            }
            j++;
        }
        return list;
    }
}