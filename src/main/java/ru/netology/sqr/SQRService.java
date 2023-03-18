package ru.netology.sqr;
public class SQRService {
    public int squareCounter(int low, int upper) {

        int a = 10;
        int b = 99;

        int sqN = 0;

        for (int i = a; i <= b; i++) {
            if ((i * i >= low) && (i * i <= upper)) {
                sqN++;
            }
        }
        return sqN;
    }
}
