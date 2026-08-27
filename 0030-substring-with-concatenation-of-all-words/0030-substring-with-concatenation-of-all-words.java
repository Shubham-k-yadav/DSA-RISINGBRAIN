class Solution {
    public List<Integer> findSubstring(String s, String[] w) {
        List<Integer> ans = new ArrayList<>();

        int wLen = w[0].length();
        int wCount = w.length;
        int totalLen = wCount*wLen;

        if(s.length()<totalLen)
        {
            return ans;
        }

        Map<String,Integer> map = new HashMap<>();

        for(int i=0;i<w.length;i++)
        {
            map.put(w[i],map.getOrDefault(w[i],0)+1);
        }

        for(int i = 0;i<wLen;i++)
        {
            int l = i;
            int r = i;
            int count = 0;

            Map<String,Integer> window = new HashMap<>();

            while(r+wLen <= s.length())
            {
                String word = s.substring(r,r+wLen);
                r += wLen;

                if(!map.containsKey(word))
                {
                    window.clear();
                    count = 0;
                    l = r;
                    continue;
                }

                window.put(word,window.getOrDefault(word,0)+1);
                count++;

                while(window.get(word)>map.get(word))
                {
                    String leftWord = s.substring(l,l+wLen);

                    window.put(leftWord, window.get(leftWord) - 1);

                    l+=wLen;
                    count--;
                }

                if(count == wCount)
                {
                    ans.add(l);
                }
            }
        }
        return ans;

    }
}