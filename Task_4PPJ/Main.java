package com.company;

public class Main {

    public static void main(String[] args){

	int a = 23;
	int r =121;
	int g = 255;
	int b = 130;
	int color = 0;
	System.out.println("a,r,g,b =" + a + ", " + r + " , " + g + ", " + b + ", ");
	//input 4 components into 1
        color = a <<24 | r << 16 | g << 8 | b <<0;
        System.out.println("colory_binary" + Integer.toBinaryString(color));
        System.out.println("color_int =" + color);
        a = r = g = b = 0;
        // unpack color to et its 4 components back in a , r , g , b
        a =color>>24 & 0xff;
        r =color>>16 & 0xff;
        g =color>>8 & 0xff;
        b =color>>0 & 0xff;

        System.out.println("a = " + Integer.toBinaryString(a));
        System.out.println("r = " + Integer.toBinaryString(r));
        System.out.println("g = " + Integer.toBinaryString(g));
        System.out.println("b = " + Integer.toBinaryString(b));
        System.out.println("a,r,g,b = " + a +", " + r +", " + g +", " + b);
    }
}
