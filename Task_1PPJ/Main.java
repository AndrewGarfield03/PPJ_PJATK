package com.company;

public class Main {

    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        int c = 7;
        toString(a,b,c);
        // set numbers in ABC order
        int tmp = 0;
        if (b > a && b > c) {
            tmp = c;
            c = a;
            a = tmp;
        } else if (a > b) {
            tmp = b;
            b = a;
            a = tmp;
        }
        toString(a,b,c);

    }
    public static void toString(int a , int b , int c){
        System.out.println(a + "" + b + "" + c);
    }
}



