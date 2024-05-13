public class KTimes{
    static int solve(int[]  input,int k){
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int n = input.length;
        for(int i = 0; i < n; i++) {
            map.put(input[i], map.getOrDefault(input[i], 0) + 1);
            if(map.get(input[i]) == k) {
                return input[i];
            }
        }
        return -1;
    }
}
