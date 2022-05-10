package com.company;

import java.util.Scanner;

public class LinearEquationResolver {
    public static void main(String[] args) {
        System.out.println("Giải phương trình bậc nhất sau:");
        System.out.println("Phương trình bậc nhất có dạng 'ax+b=c' ");

        Scanner scanner = new Scanner(System.in);
        System.out.println("a: ");
        double a = scanner.nextDouble();
        System.out.println("b: ");
        double b = scanner.nextDouble();
        System.out.println("c: ");
        double c = scanner.nextDouble();
        if (a != 0) {
            double answer = (c - b) / a;
            System.out.println("phương trình có nghiệm x= " + answer);
        } else {
            if (b == c) {
                System.out.println("phương trình vô số nghiệm" );
            } else {
                System.out.println("phương trình vô nghiệm");
            }
        }
    }}
