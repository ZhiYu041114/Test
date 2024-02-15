package com.google.APITest;

import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.regex.MatchResult;
import java.util.stream.Stream;

public class ScannerTest {
    @Test
    public void Test_1() throws NoSuchElementException, FileNotFoundException {

        // 通过文件路径获取文件内容
        File file = new File("D:\\Code\\Java\\Test\\file\\1.txt");
        Scanner scanner = new Scanner(file);
        // 更改过滤词  原本为空格
        scanner.useDelimiter("fuck");


        Stream<MatchResult> matchResultStream = scanner.findAll("123");
        System.out.println(matchResultStream.toString());

        // 输入要寻找的字符串和搜寻的范围， 返回null或该字符串
        System.out.println(scanner.findWithinHorizon("fuck fuck fuck fuck", (int) file.getTotalSpace()));

        // 检查下一个数字？ radix 检查进制类型
        System.out.println(scanner.hasNextBigInteger(2));

        // return local language
        System.out.println(scanner.locale());

        // 获取当前进制类型
        System.out.println(scanner.radix());

        // 返回 token
        while (scanner.hasNext()) {
            System.out.println(scanner.next());
        }

        // 设置进制
        scanner.useRadix(2);

        // 设置语言
        scanner.useLocale(new Locale("en"));

        //       练习
        // 编写一个程序，从用户输入中读取一个整数，并判断该整数是否为偶数。

        if (scanner.nextInt() % 2 == 0) {
            System.out.println("This is a even number");
        }else{
            System.out.println("This is a odd number");
        }

        // 编写一个程序，从用户输入中读取一个字符串，并将其转换为大写输出
        System.out.println(scanner.next().toUpperCase());

        // 编写一个程序，从用户输入中读取一个双精度浮点数，并计算其平方根
        System.out.println(Math.sqrt(scanner.nextFloat()));

        // 编写一个程序，从用户输入中读取一个十六进制字符串，并将其转换为对应的十进制数输出。
        scanner.useRadix(16);
        System.out.println(Integer.parseInt(scanner.next(),16));

    }
}