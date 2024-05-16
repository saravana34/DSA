class SplitWordsBySeparator {
    public List<String> splitWordsBySeparator(List<String> words, char separator) {
        List<String> res = new ArrayList<>();
        for(String s : words) {
            String[] str = s.split("\\Q" + separator + "\\E");
            for(String arr : str) {
                if(!arr.isEmpty()) {
                    res.add(arr);
                }
            }
        }
        return res;
        /*List<String> nm=new ArrayList<>();
        for(int i=0;i<words.size();i++) {
            String arr[]=words.get(i).split("["+separator+"]");
            for(int j=0;j<arr.length;j++){
                if(arr[j].length()>0) {
                    nm.add(arr[j]);
                }
            }
        }
        return nm;*/
    }
}
