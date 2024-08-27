package main.java.bronze.b2884;

// 백준 2884 알람 시계

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int hour = sc.nextInt();
        int minute = sc.nextInt();

        sc.close();

        if (minute >= 45) {
            minute = minute - 45;
            System.out.print(hour + " " + minute);
        } else {
            if (hour == 0) {
                hour = 23;
            } else {
                hour = hour - 1;
            }
            int temp = minute - 45;
            minute = 60 + temp;
            System.out.println(hour + " " + minute);
        }
    }
}
