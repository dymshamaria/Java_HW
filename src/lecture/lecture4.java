package lecture;

import java.util.Arrays;

public class lecture4 {
    public static void main(String[] args) {

//        boolean itMoves = true;
//        boolean shouldItMove = false;
//
//        if (itMoves == shouldItMove) {
//            System.out.println("No problem");
//        } else if (itMoves) {
//            System.out.println("Use duct tape");
//        } else {
//            System.out.println("Use WD-40");
//        }


//        for (int i = 0; i < 10; i = i + 1) {
//            System.out.println("Привет!");
//        }


//        int[] scoreMarks = new int[10];
//        scoreMarks[0]=5;
//        scoreMarks[1]=5;
//        scoreMarks[9]=3;


//        int[] scoreMarks = new int[]{5, 5, 5, 5, 4, 3, 3, 2, 1, 3};
//        for (int i = 0; i < scoreMarks.length; i = i + 1) {
//            int score = scoreMarks[i];
//            if (score < 4) {
//                scoreMarks[i] = score + 1;
//            }
//        }
//        System.out.println(Arrays.toString(scoreMarks));
//    }


//        int[] scoreMarks = new int[]{5, 5, 5, 5, 4, 3, 3, 2, 1, 3};
//
//        int sum = 0;
//        for (int i = 0; i < scoreMarks.length; i = i + 1) {
//            sum = sum + scoreMarks[i];
//        }
//        System.out.println(sum * 1.0 / scoreMarks.length);
//    }

//        int[] scoreMarks = new int[]{5, 5, 5, 5, 4, 3, 3, 2, 1, 3};
//
//        int min = Integer.MAX_VALUE;
//        for (int i = 0; i < scoreMarks.length; i = i + 1) {
//            int elem = scoreMarks[i];
//            if (elem < min) {
//                min = elem;
//            }
//        }
//        System.out.println(min);
//    }

//        int[] scoreMarks = new int[]{5, 5, 5, 5, 4, 3, 3, 2, 1, 3};
//
//        int max = Integer.MIN_VALUE;
//        for (int i = 0; i < scoreMarks.length; i = i + 1) {
//            int elem = scoreMarks[i];
//            if (elem < max) {
//                max = elem;
//            }
//        }
//        System.out.println(max);
//    }


//        int[] arr = new int[]{5, 5, 5, 5, 4, 3, 3, 2, 1, 3};
//
//        int[] results = new int[arr.length];
//        for (int i = 0; i < arr.length; i = i + 1) {
//            int elem = arr[i];
//            results[i] = elem * elem;
//        }
//        System.out.println(Arrays.toString(results));
//    }


//        System.out.println(scoreMarks[8]);
//        scoreMarks[7]=4;
//        scoreMarks[8]=4;
//        System.out.println(Arrays.toString(scoreMarks));


//        int counter = 0;
//
//        while (counter < 5){
//            System.out.println("I'm here!");
//            counter++;
//        }


//        do {
//            System.out.println("I'm here!");
//            counter++;
//        } while (counter < 5);


        int min = 0;
        int max = 100;
        int myNumber = 15;

        int guess;
        do {
            guess = (min + max) / 2;
            System.out.print("I'm guessing ");
            System.out.println(guess);

            if (guess < myNumber) {
                min = guess;
            } else {
                max = guess;
            }
        } while (guess != myNumber);


    }
}


