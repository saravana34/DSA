public class PrimeFactor{
    static int[] solve(int n){
        List<Integer> result = new ArrayList<>();
        while(n % 2 == 0) {
            result.add(2);
            n = n / 2;
        }
        for(int i = 3; i <= Math.sqrt(n); i = i + 2) {
            while(n % i == 0) {
                result.add(i);
                n = n / i;
            }
        }
        if(n > 2) {
            result.add(n);
        }
        int[] arr = result.stream().mapToInt(i -> i).toArray();
        return arr;
    }
}
