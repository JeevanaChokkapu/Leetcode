class Solution {
    public List<String> stringMatching(String[] words) {
        ArrayList<String> result=new ArrayList<>();
        ArrayList<String> temp=new ArrayList<>();
        for(int i=0;i<words.length;i++)
        temp.add(words[i]);
        for(int i=0;i<words.length;i++)
        for(int j=0;j<words.length;j++)
        if(words[i].contains(words[j]) && !result.contains(words[j])&& j!=i )
        {
             result.add(words[j]);
        }
        return result;
    }
}