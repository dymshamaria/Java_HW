package hw;

import java.util.Arrays;

public class hw4 {
    public static void main(String[] args) {

        //1
//        for (int i = 0; i <= 15; i++) {
//            System.out.print(i + " ");
//        }

        //2
//        for (int i = 1; i < 10000; i *= 5) {
//            System.out.println(i);
//        }

        //3
//        for (int i = 40; i <= 60; i++) {
//            if (i % 4 == 0) {
//                System.out.println(i);
//            }
//        }

        //or

//        for (int i = 40; i <= 60; i += 4) {
//            System.out.println(i);
//        }

        //4
//        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
//        int sum = 0;
//        for (int i = 0; i < array.length; i++) {
//            sum = sum + array[i];
//        }
//        System.out.println(sum);

        //5
//        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
//
//        int max = Integer.MIN_VALUE;
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] > max) {
//                max = array[i];
//            }
//        }
//        System.out.println(max);

        //6
//        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
//
//        int min = Integer.MAX_VALUE;
//        for (int i = 0; i < array.length; i++) {
//            int elem = array[i];
//            if (elem < min) {
//                min = elem;
//            }
//        }
//        System.out.println(min);

        //7

//        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
//
//        int sum = 0;
//        for (int i = 0; i < array.length; i++) {
//            sum = sum + array[i];
//        }
//        System.out.println(sum * 1.0 / array.length);

        //8
//        int[] array = {1, -2, 3, -4, -5, -6, 7, 8, -9};
//        int positives = 0;
//        int negatives = 0;
//        for (int i = 0; i < array.length; i++) {
//            int elem = array[i];
//            if (elem > 0) {
//                positives++;
//            } else if (elem < 0) {
//                negatives++;
//            }
//        }
//        System.out.print("positive: ");
//        System.out.println(positives);
//        System.out.print("negative: ");
//        System.out.println(negatives);

        //9
//        int[] array = new int[]{1, 2, 73, 4, 5};
//        boolean isSorted = true;
//        for (int i = 0; i < array.length - 1; i++) {
//            if (array[i] > array.length - 1) {
//                isSorted = false;
//                break;
//            }
//        }
//        if (isSorted) {
//            System.out.println("Array is sorted");
//        } else {
//            System.out.println("Array is NOT sorted");
//        }

        //10
//        int n = 20;
//
//        int[] result = new int[n];
//        for (int i = 0; i < n; i++) {
//            if (i == 0 || i == 1) {
//                result[i] = 1;
//            } else {
//                result[i] = result[i - 1] + result[i - 2];
//            }
//        }
//        System.out.println(Arrays.toString(result));

        //or

        int n = 20;

        int prev = 0;
        int prevPrex = 0;
        int current;

        for (int i = 0; i < n; i++) {
            if (i == 0 || i == 1) {
                current = 1;
            } else {
                current = prev + prevPrex;
            }
            System.out.println(current);
            prevPrex = prev;
            prev = current;
        }

    }
}


