package Tools;

import java.util.Random;

public class ArrayGenerator {
    private ArrayGenerator() {
    }

    public static Integer[] generateOrderedArray(int n) {

        Integer[] arr = new Integer[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i;
        }
        return arr;
    }

    //generate a length of n ramdom array, range [0, bound)
    public static Integer[] generateRamdomArray(int n, int bound) {

        Integer[] arr = new Integer[n];

        Random rnd = new Random();
        for(int i = 0; i < n; i ++) {
            arr[i] = rnd.nextInt(bound);
        }
        return arr;
    }

}
