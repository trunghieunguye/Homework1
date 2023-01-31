package Homework;


public class Ex4 {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;
        if (a > b & a > c & a > d) {
            System.out.println(a + " la so lon nhat");
        } else if (b > c & b > d) {
            System.out.println(b + " la so lon nhat");
        } else if (c > d) {
            System.out.println(c + " la so lon nhat");
        } else {
            System.out.println(d + " la so lon nhat");


        }


    }
}
