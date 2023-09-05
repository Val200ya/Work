package org.example;

public class MyMath {
    public static final double PI = 3.1415926535;
    public static final double E = 2.7182818284;

    public static double min(double firstNum, double secondNum) {
        if (firstNum > secondNum) {
            return secondNum;
        } else {
            return firstNum;
        }
    }

    public static int min(int firstNum, int secondNum) {
        if (firstNum > secondNum) {
            return secondNum;
        } else {
            return firstNum;
        }
    }

    public static float min(float firstNum, float secondNum){
        if (firstNum > secondNum) {
            return secondNum;
        } else {
            return firstNum;
        }
    }

    public static long min(long firstNum, long secondNum){
        if (firstNum > secondNum) {
            return secondNum;
        } else {
            return firstNum;
        }
    }

    /*public static double arcsin(){

    }*/
    public static int degree(int num, int degree){
        if (degree == 0){
            num = 1;
            return num;
        } else if (degree == 1){
            return num;
        } else if (degree == 2){
            num = num * num;
            return num;
        }
        return num;
    }
    public static double circleSquare(int r){
        r = r * r;
        double s = PI * r;
        return s;
    }
    public static double circleLength(int r){
        double l = 2 * PI * r;
        return l;
    }
}