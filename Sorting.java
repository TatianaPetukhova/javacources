import java.util.Arrays;
import java.util.Random;


public class Sorting {
    public static void main(String[] args) {

        int range = 10;
        int[] input = new int[range];
        Random random = new Random();

        for (int l = 0; l < range; l++) {
            input[l] = random.nextInt(100);
        }

        input = sortArray(input);
        System.out.println(Arrays.toString(input));
    }

    public static int[] merge(int[] left, int[] right) {
        int lef = left.length;
        int rig = right.length;
        int[] merge = new int[lef + rig];
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < lef && j < rig) {
            if (left[i] <= right[j]) {
                merge[k] = left[i];
                i++;
                k++;

            } else {
                merge[k] = right[j];
                j++;
                k++;
            }
        }

        if (i < lef) {
            while (i < lef) {
                merge[k] = left[i];
                i++;
                k++;
            }
        }
        if (j < rig) {
            while (j < rig) {
                merge[k] = right[j];
                j++;
                k++;
            }
        }
        return merge;
    }

    public static int[] sortArray(int[] a) {
        if (a.length <= 1) {
            return a;
        }
        int p = a.length / 2;
        int[] leftArray = new int[p];
        int[] rightArray = new int[a.length - p];
        System.arraycopy(a, 0, leftArray, 0, p);
        System.arraycopy(a, p, rightArray, 0, a.length - p);
        return merge(sortArray(leftArray), sortArray(rightArray));
    }
}