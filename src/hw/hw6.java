package hw;

import java.util.Scanner;

public class hw6 {
    public static void main(String[] args) {

        //1
//        int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
//        int sum = 0;
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                sum += array[i][j];
//            }
//        }
//        System.out.println(sum);

        //2
//        int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
//        int min = Integer.MAX_VALUE;
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                if (array[i][j] < min) {
//                    min = array[i][j];
//                }
//            }
//        }
//        System.out.println(min);

        //3
//        int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
//        int max = Integer.MIN_VALUE;
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                if (array[i][j] < max) {
//                    max = array[i][j];
//                }
//            }
//        }
//        System.out.println(max);

        //4
//        int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
//        int count = 0;
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                count++;
//            }
//        }
//        System.out.println(count);

        //5
//        for (int i = 0; i < 10; i++) {
//            for (int j = 0; j < 10 - i; j++) {
//                System.out.print(j + " ");
//            }
//            System.out.println();
//        }

        //6
//        for (int i = 0; i < 10; i++) {
//            for (int j = 0; j < i; j++) {
//                System.out.print("  ");
//            }
//
//            for (int j = 9 - i; j >= 0; j--) {
//                System.out.print(j + " ");
//            }
//            System.out.println();
//        }

        //7
//        for (int i = 0; i < 10; i++) {
//            for (int j = 0; j < i; j++) {
//                System.out.print("  ");
//            }
//
//            for (int j = 9 - i; j >= 0; j--) {
//                System.out.print(j + " ");
//            }
//
//            for (int j = 1; j < 10 - i; j++) {
//                System.out.print(j + " ");
//            }
//            System.out.println();
//        }

        //8
        System.out.println("Введите целое число: ");

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

//        int n = 9;

        int[] fibonacci = new int[n];

        fibonacci[0] = 0;
        fibonacci[1] = 1;

        for (int i = 2; i < n; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }
//        System.out.print(n);

        for (int num : fibonacci) {
            System.out.print(num + " ");
        }
    }
}

