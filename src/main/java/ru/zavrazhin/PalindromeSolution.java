package ru.zavrazhin;

public class PalindromeSolution {
    public static boolean isPalindrome(String num) {
        if (num == null) {
            return false;
        }
        int size = num.length();
        if (size == 0) {
            return false;
        }
        for (int i = 0; i <= size / 2; i++) {
            char A = num.charAt(i);
            char B = num.charAt(size - i - 1);
            if (A != B) {
                return false;
            }
        }
        return true;
    }
}
