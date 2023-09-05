package org.example;

public class Test {
    public static void main(String[] args) {
        System.out.println(MyMath.min(4.5, 3.2)); // double
        System.out.println(MyMath.min(5.226754, 7.35768)); // float
        System.out.println(MyMath.min(456456,23958943)); // long
        System.out.println(MyMath.min(2, 6)); // int
        System.out.println(MyMath.degree(5, 0));
        System.out.println(MyMath.circleSquare(6));
        System.out.println(MyMath.circleLength(6));
    }
}
