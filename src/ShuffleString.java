class Solution {
    public String shuffleString(String s, int[] indices) {
        StringBuilder temp=new StringBuilder();
        char arr[] = new char[s.length()];
        int i = 0;
        for(char ch: s.toCharArray()) {
            arr[indices[i++]]=ch;
        }
        for(char ch:arr)
        {
            temp.append(ch);
        }
        return temp.toString();
    }
}
