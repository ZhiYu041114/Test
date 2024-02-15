package com.google.JustOnlyTest;

public class Demo {
    public static void main(String[] args){
        System.out.println("hello world!");
        int numebr = 10;
        System.out.println("numebr = " + numebr);
        System.out.println(sum(1,2));
        String string = "Java Programming";
        System.out.println(string.length());
        System.out.println(Eoo(3));
        int[] array_1 = {1,2,3,4,5};
        for (int i = 0; i < array_1.length; i++) {
            System.out.println(array_1[i]);
        }
        for (int i = 1; i <= 10; i++) {
            if(i % 2 == 1){
                System.out.println(i);
            }
        }
        String[] array_2 = {"Java","Python","C++","Javascript"};
        for (int i = 0; i < array_2.length; i++) {
            System.out.println(array_2[i]);
        }

        Student Jadu = new Student();
        Jadu.setName("Jadu");
        Jadu.setAge(20);
        Jadu.setScore(100);
        System.out.println(Jadu.getAge());

        //计算器
        Calculator calculator = new Calculator();
        calculator.Start();
    }

    static int sum(int number1, int number2){
        return number1+number2;
    }

    static String Eoo(int number){
        if (number % 2 == 0){
            return "Even";
        }else{
            return "Odd";
        }
    }
    static class Student{
        String name;
        int age;
        int score;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public int getScore() {
            return score;
        }

        public void setScore(int score) {
            this.score = score;
        }
    }
}
