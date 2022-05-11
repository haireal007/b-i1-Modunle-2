package com.company;

import java.util.Scanner;

public class Vnd {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("nhập số tiền USD:  ");
            float USD= scanner.nextFloat();
            float VND= USD*23000;
            System.out.printf("số tiền chuyển đổi qua VND: %s",VND);
    }
}
