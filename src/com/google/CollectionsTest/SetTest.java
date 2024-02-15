package com.google.CollectionsTest;

import org.junit.Test;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class SetTest {
    @Test
    public void test_1() {
        HashSet<String> hashSet = new HashSet<>();
        // 没有顺序，不重复
        hashSet.add("Frank");
        hashSet.add("Jadu");
        hashSet.add("Tom");
        hashSet.add("Frank");

        System.out.println(hashSet);

        for (String value :
                hashSet) {
            System.out.println(value);
        }
        // 哈希 Hash 单项散列函数 散列函数 JDK1.8
        // 底层采取数组和链表
        // 1.8之后 采用数组 链表 红黑树
    }

    @Test
    public void test_2(){
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("Frank");
        linkedHashSet.add("Jadu");
        linkedHashSet.add("#2");
        linkedHashSet.add("Tom");
        linkedHashSet.add("Jadu");

        System.out.println(linkedHashSet);
    }
}