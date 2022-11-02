package com.tak.study;

import java.util.Scanner;

public class Study {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num;

        do {
            System.out.print("2이상의 정숫값 : ");

            num = sc.nextInt();
        } while (num < 2);

        int i;

        for (i = 2; i < num; i++) {
            if (num % i == 0) {                 //나누어 떨어진다.(=소수가 아니다)
                break;
            }
        }

        if (i == num) {
            System.out.println("소수입니다.");
        } else {
            System.out.println("소수가 아닙니다.");
        }
    }

}
