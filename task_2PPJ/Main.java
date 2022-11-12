package com.company;

import java.util.Scanner;

public class Main {
   static int a = 3;
    static int b = 1;
  static   int c = 8;
    static  char symbol_a = ' ';
    static char symbol_b = ' ';
    static char symbol_c = ' ';
    private static int maxValue;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number");
        a = scan.nextInt();
        b = scan.nextInt();
        c = scan.nextInt();
        int maxValue = 0;
        if (a >= b) {
            if (a >= c) {
                maxValue = a;

            } else {
                maxValue = c;
            }
        }
        else {
            if (b>=c){
                maxValue = b;
            }
            else{
                maxValue =c;
            }
        }
        for (int i = 0; i < maxValue; i++) {
            if ((maxValue - i) <= a) {
                symbol_a = '*';
            }
            if ((maxValue - i) <= b) {
                symbol_b = '*';
            }
            if ((maxValue - i) <= c) {
                symbol_c = '*';

            }
             System.out.println(symbol_a + "" + symbol_b +"" + symbol_c);

        }
    }
}
