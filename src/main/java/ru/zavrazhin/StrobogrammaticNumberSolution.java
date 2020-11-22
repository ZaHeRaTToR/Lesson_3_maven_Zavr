package ru.zavrazhin;

public class StrobogrammaticNumberSolution {
    public boolean isStrobogrammatic(String num) {
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
            switch (A) {
                case '0':
                    if (B != '0') {
                        return false;
                    }
                    break;
                case '1':
                    if (B != '1') {
                        return false;
                    }
                    break;
                case '6':
                    if (B != '9') {
                        return false;
                    }
                    break;
                case '8':
                    if (B != '8') {
                        return false;
                    }
                    break;
                case '9':
                    if (B != '6') {
                        return false;
                    }
                    break;
                default:
                    return false;
            }
        }
        return true;
    }
}
