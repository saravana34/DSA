class SlowestKey {
    public char slowestKey(int[] releaseTimes, String keysPressed) {
        int max = releaseTimes[0];
        char res = keysPressed.charAt(0);
        for(int i = 1; i < releaseTimes.length; i++) {
            if(max < releaseTimes[i] - releaseTimes[i - 1]) {
                max = releaseTimes[i] - releaseTimes[i - 1];
                res = keysPressed.charAt(i);
            } else if(max == releaseTimes[i] - releaseTimes[i - 1]) {
                if(res < keysPressed.charAt(i)) {
                    res = keysPressed.charAt(i);
                }
            }
        }
        return res;
    }
}
