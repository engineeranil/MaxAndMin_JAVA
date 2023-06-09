public class MaxAndMın {
    static void max() {
        int[] list = new int[]{1, 2, 3, 4, 5};
        int max = list[2];
        for (int gez : list) {
            if (max > gez) {
                max = gez;
            }

        }
    }
}