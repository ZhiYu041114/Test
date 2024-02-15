package com.google.JustOnlyTest;

import java.util.Scanner;

public class Calculator {
    public void Start() {
        System.out.println("Welcome to my calculator!");
        System.out.println("Please choose by input index:");
        System.out.println("1.加");
        System.out.println("2.减");
        System.out.println("3.乘");
        System.out.println("4.除");
        Scanner scanner = new Scanner(System.in);
        switch (scanner.nextInt()) {
            case 1:
                System.out.println("输入两个加数，用空格隔开");
                System.out.println(Math.addExact(scanner.nextInt(), scanner.nextInt()));
                break;
            case 2:
                System.out.println("请输入两个数字,用空格隔开");
                System.out.println(scanner.nextInt() - scanner.nextInt());
                break;
            case 3:
                System.out.println("请输入两个数字,用空格隔开");
                System.out.println(scanner.nextInt() * scanner.nextInt());
                break;
            case 4:
                System.out.println("请输入两个数字,用空格隔开");
                System.out.println(scanner.nextInt() / scanner.nextInt());
                break;
            default:
                break;
        }
    }
}
