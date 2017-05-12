import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
        int n2 = in.nextInt();

        int[] array1 = new int[n1];
        int[] array2 = new int[n2];

        for (int i = 0; i < n1; i++) {
            array1[i] = in.nextInt();
        }
        for (int i = 0; i < n2; i++) {
            array2[i] = in.nextInt();
        }
        in.close();

        System.out.println(isArrayInArray(array1, array2));
    }

    private static int isArrayInArray(int[] array1, int[] array2) {
        int result = -1;
        int localResult = -1;
        int array2_i = 0;
        boolean firstIsOk = false;

        for (int array1_i = 0; array1_i < array1.length; array1_i++) {
            if (array1[array1_i] == array2[array2_i]) {
                if (!firstIsOk) {
                    localResult = array1_i;
                }
                firstIsOk = true;
                array2_i++;
                if (array2_i == array2.length) {
                    result = localResult;
                    array2_i = 0;
                    firstIsOk = false;
                }
            } else {
                array2_i = 0;
                firstIsOk = false;
            }
        }

        return result;
    }
}
