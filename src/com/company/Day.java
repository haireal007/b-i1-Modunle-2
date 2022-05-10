package com.company;

import java.util.Scanner;

public class Day {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập tháng cần tra cứu ");
        int month = scanner.nextInt();
        String daysInMonth;
        switch (month) {
            case 2:
                daysInMonth = "28 or 29";
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                daysInMonth = "31";
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                daysInMonth = "30";
                break;
            default:
                daysInMonth = "";
        }
//1,Phương equals()thức so sánh hai chuỗi và trả về true nếu các chuỗi bằng nhau và false nếu không.
//2,compareTo()pháp so sánh hai chuỗi về mặt từ vựng.
//    So sánh dựa trên giá trị Unicode của mỗi ký tự trong chuỗi.
//    Phương thức trả về 0 nếu chuỗi này bằng chuỗi kia. Giá trị nhỏ hơn 0 được trả về nếu chuỗi nhỏ hơn chuỗi khác
//    (ít ký tự hơn) và giá trị lớn hơn 0 nếu chuỗi lớn hơn chuỗi khác (nhiều ký tự).
        if (!daysInMonth.equals("")) System.out.println("tháng " + month + " có " + daysInMonth + " ngày");
        if (!daysInMonth.equals("")) System.out.printf("tháng '%d' có %-20s ngày", month, daysInMonth);
        else System.out.print("Tháng nhập không hợp lệ");
    }
}
