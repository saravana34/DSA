import java.util.Set;
public class LongestConsecutiveSequence{
    static int solve(int[]  input){
        if(input == null || input.length == 0) {
            return 0;
        }
        Set<Integer> numSet = new HashSet<>();
        for(int num : input) {
            numSet.add(num); 
        }
        int longStreak = 0;
        for(int num : input) {
            if(!numSet.contains(num - 1)) {
                int currNum = num;
                int currStreak = 1;
                while(numSet.contains(currNum + 1)) {
                    currNum++;
                    currStreak++;
                }
                longStreak = Math.max(longStreak, currStreak);
            }
        }
        return longStreak;
    }
}
