package com.company;

import com.sun.org.apache.xpath.internal.objects.XString;

import java.util.Scanner;

public class Name {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhập tên:");
        String name;
        name = scanner.nextLine();
        System.out.printf("Hello %s",name);
    }
}
