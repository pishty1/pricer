package org.example;

public class Random1 {

    public static double getGaussianBySummation() {
        double x = 0;
        for (int i = 0; i < 12; i++) {
            x += Math.random();
        }
        return x - 6.0;
    }

    public static double getGaussianByBoxMuller() {
        double x = 0;
        double y = 0;
        double euclidSquare = 0;

        do {
            x = 2.0 * Math.random() - 1.0;
            y = 2.0 * Math.random() - 1.0;
            euclidSquare = x * x + y * y;
        } while (euclidSquare >= 1.0);

        return x * Math.sqrt(-2.0 * Math.log(euclidSquare) / euclidSquare);
    }
}
