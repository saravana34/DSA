class MinRefuelStops {
    public int minRefuelStops(int target, int startFuel, int[][] stations) {
        int n = stations.length;
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> b[1] - a[1]);
        int stop = 0, start = 0, dist = startFuel;
        while(dist < target) {
            while(start < n && dist >= stations[start][0]) {
                pq.add(stations[start]);
                start++;
            }
            if(pq.isEmpty()) {
                return -1;
            }
            dist += pq.remove()[1];
            stop++;
        }
        return stop;
    }
}
