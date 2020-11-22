package ru.zavrazhin;

public class PowerOfFourSolution {
    public boolean isPowerOfFour(int n) {
        while (n % 4 == 0) {
            n = n / 4;
        }
        boolean result =  n == 1;
        return result;
    }
}
