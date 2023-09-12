package hw.hw7;

public class Palindrom {

    static boolean isPalindrom(String s) {
        char[] str = s.toCharArray();
        int left = 0;
        int right = str.length - 1;

        while (left <= right) {
            System.out.println("L " + left + " R " + right);
            if (str[left] != str[right])
                return false;
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrom("aaa"));
        System.out.println(isPalindrom("aaab"));
    }
}