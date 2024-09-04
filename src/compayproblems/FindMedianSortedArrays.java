class FindMedianSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        //Ensure nums1 is the smaller array
        if(n1 > n2) {
            return findMedianSortedArrays(nums2, nums1);
        }
        int low = 0, high = n1;
        int left = (n1 + n2 + 1) / 2; //calculate the left partition size
        int n = n1 + n2;
        while(low <= high) {
            int mid1 = (low + high) / 2; //caculate mid index of nums1 -> (low + high) >> 1
            int mid2 = left - mid1;//caculate mid index of nums2
            int l1 = Integer.MIN_VALUE, r1 = Integer.MAX_VALUE;
            int l2 = Integer.MIN_VALUE, r2 = Integer.MAX_VALUE;
            //Determine the values of l1, l2, r1, r2
            if(mid1 < n1) {
                r1 = nums1[mid1];
            }
            if(mid2 < n2) {
                r2 = nums2[mid2];
            }
            if(mid1 - 1 >= 0) {
                l1 = nums1[mid1 - 1];
            }
            if(mid2 - 1 >= 0) {
                l2 = nums2[mid2 - 1];
            }

            if(l1 <= r2  && l2 <= r1) {
                //The partition is correct we found the median
                if(n % 2 == 1) {
                    return Math.max(l1, l2);
                }
                return ((double)(Math.max(l1, l2) + Math.min(r1, r2)))/ 2.0;
            } else if(l1 > r2) {
                //Move towards left side of nums1
                high = mid1 - 1;
            } else {
                //Move towards right side of nums1
                low = mid1 + 1;
            }
        }
        return 0;
    }
}
