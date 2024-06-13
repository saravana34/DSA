class UncommonFromSentences {
    public String[] uncommonFromSentences(String s1, String s2) {
        String str1[] = s1.split(" ");
        String str2[] = s2.split(" ");

        //creating map to store both arrays input with number of occurance
        Map<String,Integer> map = new HashMap<>();

        //storing values to map
        for(int i=0;i<str1.length;i++){
            map.put(str1[i],map.getOrDefault(str1[i],0)+1);
        }
        for(int i=0;i<str2.length;i++){
            map.put(str2[i],map.getOrDefault(str2[i],0)+1);
        }

        //adding values to list which have values as 1 (it means they occure once in string)
        List<String> ls = new ArrayList<>();
        for (Map.Entry<String, Integer> me : map.entrySet()) { 
            if(me.getValue() == 1){
                ls.add(me.getKey());
            }
        } 
        
        //creating and storing list values to array to return
        String ans[] = new String[ls.size()];
        int ind = 0;
        for(String s:ls){
            ans[ind++] = s;
        }

        return ans;
    }
}
