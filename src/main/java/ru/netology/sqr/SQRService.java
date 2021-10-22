package ru.netology.sqr;

public class SQRService {

    public int counter(int min, int max) {

        //int min = 200;
        //int max = 300;
        int count = 0;
        for (int i = 10; i <= 99; i++) {
    if (i * i >= min && i * i <= max) {
        count = count + 1;
    }
}
        return count;
    }
}
