class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> h=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            if(!h.containsKey(s.charAt(i)))
            h.put(s.charAt(i),1);
            else
            {
                h.put(s.charAt(i),h.getOrDefault(s.charAt(i),0)+1);
            }
        }
        List<Character> list=new ArrayList<>(h.keySet());
        Collections.sort(list,(a,b) -> h.get(b)-h.get(a));
        StringBuilder str=new StringBuilder();
        for(char c:list)
        {
            for(int i=0;i<h.get(c);i++)
            str.append(c);
        }
        return str.toString();
    }
}