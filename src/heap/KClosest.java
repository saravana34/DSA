class KClosest {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> maxHeap = new PriorityQueue<>((a, b) -> b[0] - a[0]);
        for(int i = 0; i < points.length; i++) {
            int dist = points[i][0] * points[i][0] + points[i][1] * points[i][1];
            maxHeap.add(new int[]{dist, i});
            if(maxHeap.size() > k) {
                maxHeap.poll();
            }
        }
        int[][] result = new int[k][2];
        for(int i = 0; i < k; i++) {
            int[] entry = maxHeap.remove();
            int index = entry[1];
            result[i] = points[index];
        }
        return result;
    }
}
