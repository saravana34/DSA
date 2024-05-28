class NextGreaterElement {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        int len1 = nums1.length, len2 = nums2.length;
        int[] ans = new int[len1];
        int i = 0, j = 1;
        while(i < len2) {
            if(j == len2) {
                map.put(nums2[i], -1);
                i++;
                j = i + 1;
            } else if(nums2[i] < nums2[j]) {
                map.put(nums2[i], nums2[j]);
                i++;
                j = i + 1;
            } else if(nums2[i] > nums2[j]) {
                j++;
            }
        }
        for(int k = 0; k < len1; k++) {
            ans[k] = map.get(nums1[k]);
        }
        return ans;
    }
}
