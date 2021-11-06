package ru.zsa.triangle;

public class Square {
    public static void main(String[] args) {
        double sqr = triangleSquare(3, 4, 5);
        System.out.println("Площадь треуголника равна " + sqr);
    }
    public static double triangleSquare(int a, int b, int c){
        double p = (a + b + c) >> 1;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }

}
