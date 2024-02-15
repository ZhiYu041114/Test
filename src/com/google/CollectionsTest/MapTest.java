package com.google.CollectionsTest;

import org.junit.Test;

import java.util.*;

public class MapTest {
    @Test
    public void test_1() {
        //         key , value
        HashMap<Integer, String> hashMap = new HashMap<>();

        hashMap.put(10000, "Frank");
        hashMap.put(10001, "Jadu");
        hashMap.put(10002, "Tom");

        System.out.println(hashMap);

        String value = hashMap.get(10002);
        System.out.println(value);

        hashMap.remove(10000);
    }

    @Test
    public void test_2() {
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(10000, "Frank");
        hashMap.put(10001, "Jadu");
        hashMap.put(10002, "Tom");

        System.out.println(hashMap.containsKey(10000));
        System.out.println(hashMap.containsValue("Jadu"));
        hashMap.replace(10000, "Jerry");
        System.out.println(hashMap);
    }

    @Test
    public void test_3() {
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(10000, "Frank");
        hashMap.put(10001, "Jadu");
        hashMap.put(10002, "Tom");

        Set<Integer> keys = hashMap.keySet();
        System.out.println(keys);

        Set<Map.Entry<Integer, String>> entrySet = hashMap.entrySet();
        System.out.println(entrySet);
    }

    @Test
    public void test_4() {
        HashMap<Integer, String> hashMap = new HashMap<>();

        hashMap.put(10000, "Frank");
        hashMap.put(10001, "Jadu");
        hashMap.put(10002, "Tom");

        // 使用replace 而不是put
        hashMap.put(10001, "JJJJ");
        System.out.println(hashMap);
        // 不存在的值返回null
        System.out.println(hashMap.get(10005));
    }

    @Test
    public void test_5() {
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        hashMap.put(10000, 213);
        hashMap.put(10001, 233);
        hashMap.put(10002, 223);

        ArrayList<Integer> arrayList = new ArrayList<>();

        Set<Map.Entry<Integer,Integer>> entrySet = hashMap.entrySet();
        System.out.println(entrySet);

        Iterator<Map.Entry<Integer,Integer>> iterator = entrySet.iterator();

        while(iterator.hasNext()){
            int value = iterator.next().getValue();
            if(value >= 220){
                arrayList.add(value);
            }
        }
        System.out.println(arrayList);
    }
}