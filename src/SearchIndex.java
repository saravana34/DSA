public class SearchIndex {
  public static void main(String[] args) {
        int[] inputArr = { 1, 3, 5, 6 };
        System.out.println("Search insert index is " + searchInsert(inputArr));
    }

    public int searchInsert(int[] nums, int target) {
        int len = nums.length;
        for(int i = 0; i < len; i++){
            if(nums[i] == target){
                return i;
            } else {
                if(target < nums[i]) {
                    return i;
                } else if(i == len - 1){
                    return i + 1;
                }
            }
        }
        return 0;
    }
}
