package com.Ansaf.JavaExercies;

import java.util.Scanner;

public class getting_inputs {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        //int a,b,c;
        float a,b,c;
        System.out.println("Enter two numbers");
        //a=in.nextInt();
        //b=in.nextInt();
        a=in.nextFloat();
        b=in.nextFloat();
        c=(a*a)+(b*b)+(2*a*b);
        System.out.println("Result : "+c);
    }
}
