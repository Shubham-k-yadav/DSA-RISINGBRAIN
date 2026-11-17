class Solution {
    public String frequencySort(String s) {
        String str = "";

        Map<Character,Integer> map = new HashMap<>();

        for(int i=0;i<s.length();i++)
        {
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }

        List<Map.Entry<Character,Integer>> list = new ArrayList<>(map.entrySet());

        list.sort((a,b)-> b.getValue() - a.getValue());

        for(int i = 0;i<list.size();i++)
        {
            int freq = list.get(i).getValue();
            while(freq > 0)
            {
                str+=list.get(i).getKey();
                freq--;
            }
        }
        return str;
    }
}