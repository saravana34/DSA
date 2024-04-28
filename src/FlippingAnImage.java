public class FlippingAnImage {
    public int[][] flipAndInvertImage(int[][] image) {
        int len = image.length;
        int[][] res = new int[len][len];
        for(int i = 0; i < image.length; i++) {
            for(int j = 0; j < image[i].length; j++) {
                res[i][j] = 1 - image[i][len - j - 1];
            }
        }
        return res;
    }
}
