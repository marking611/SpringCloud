package com.example.demo.lambda;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import java.util.Base64.Encoder;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Created by makai on 2017/7/28.
 */
public class Demo {
    public static void main(String[] args) {

//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("传统方式");
//            }
//        }).start();
//        new Thread(() -> System.out.println("java8新方式：lambda表达式")).start();
//
//        JButton show = new JButton("Show");
//        show.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                System.out.println("传统方式");
//            }
//        });
//        show.addActionListener((e) -> {
//            System.out.println("java8新方式：lambda表达式");
//        });
//
//        List<String> list = new ArrayList();
//        list.add("hello");
//        list.add("world");
//        //传统方式
//        for (String word : list) {
//            System.out.print(word);
//        }
//        System.out.println();
//        //java8新方式：lambda表达式
//        list.forEach(System.out::print);
//        list.forEach(word -> System.out.print(word));
//
//
//        List<String> languages = Arrays.asList("Java", "Scala", "C++", "Haskell", "Lisp");
//
//        System.out.println("Languages which starts with J :");
//        filter(languages, (str) -> str.startsWith("J"));
//
//        System.out.println("Languages which ends with a ");
//        filter(languages, (str) -> str.endsWith("a"));
//
//        System.out.println("Print all languages :");
//        filter(languages, (s) -> true);
//
//        System.out.println("Print no language : ");
//        filter(languages, new Predicate<String>() {
//            @Override
//            public boolean test(String s) {
//                return false;
//            }
//        });
//
//        System.out.println("Print language whose length greater than 4:");
//        filter(languages, (str) -> str.length() > 4);
//
//        List<String> languages2 = Arrays.asList("Java", "Scala", "C++", "Haskell", "Lisp");
//        // 甚至可以用and()、or()和xor()逻辑函数来合并Predicate，
//        // 例如要找到所有以J开始，长度为四个字母的名字，你可以合并两个Predicate并传入
//        Predicate<String> startsWithJ = (n) -> n.startsWith("J");
//        Predicate<String> fourLetterLong = (n) -> n.length() == 4;
//        languages2.stream()
//                .filter(startsWithJ.and(fourLetterLong))
//                .forEach((n) -> System.out.print("nName, which starts with 'J' and four letter long is : " + n));


//        // 不使用lambda表达式为每个订单加上12%的税
//        List<Integer> costBeforeTax = Arrays.asList(100, 200, 300, 400, 500);
//        for (Integer cost : costBeforeTax) {
//            double price = cost + .12*cost;
//            System.out.println(price);
//        }
//        // 使用lambda表达式
//        costBeforeTax.stream().map((cost) -> cost + .12*cost).forEach(System.out::println);

//        // 不使用lambda表达式为每个订单加上12%的税
//        List<Integer> costBeforeTax = Arrays.asList(100, 200, 300, 400, 500);
//        double total = 0;
//        for (Integer cost : costBeforeTax) {
//            double price = cost + .12*cost;
//            total = total + price;
//        }
//        System.out.println("Total : " + total);
//        //使用lambda表达式
//        double bill = costBeforeTax.stream().map((cost) -> cost + .12*cost).reduce((sum, cost) -> sum + cost).get();
//        System.out.println("Total : " + bill);


//        // 创建一个字符串列表，每个字符串长度大于2
//        List<String> strList = new ArrayList<>();
//        Scanner scanner;
//        while (true){
//            scanner = new Scanner(System.in);
//            String input = scanner.next(); //控制台输入
//            System.out.println("输入的是："+input);
//            if ("end".equals(input)){
//                break;
//            }
//            strList.add(input);
//        }
//        List<String> filtered = strList.stream().filter(x -> x.length()> 2).collect(Collectors.toList());
//        System.out.printf("Original List : %s, filtered list : %s %n", strList, filtered);


//        // 将字符串换成大写并用逗号链接起来
//        List<String> G7 = Arrays.asList("USA", "Japan", "France", "Germany", "Italy", "U.K.","Canada");
//        String G7Countries = G7.stream().map(x -> x.toUpperCase()).collect(Collectors.joining(", "));
//        System.out.println(G7Countries);

//        // 用所有不同的数字创建一个正方形列表
//        List<Integer> numbers = Arrays.asList(9, 10, 3, 4, 7, 3, 4);
//        List<Integer> distinct = numbers.stream().map( i -> i*i).distinct().collect(Collectors.toList());
//        System.out.printf("Original List : %s,  Square Without duplicates : %s %n", numbers, distinct);


//        //获取数字的个数、最小值、最大值、总和以及平均值
//        List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);
//        IntSummaryStatistics stats = primes.stream().mapToInt((x) -> x).summaryStatistics();
//        System.out.println("Highest prime number in List : " + stats.getMax());
//        System.out.println("Lowest prime number in List : " + stats.getMin());
//        System.out.println("Sum of all prime numbers : " + stats.getSum());
//        System.out.println("Average of all prime numbers : " + stats.getAverage());

        Encoder e = Base64.getEncoder();
        System.out.print(e.encode("351193400".getBytes()));
    }

    public static void filter(List<String> names, Predicate<String> condition) {
        for(String name: names)  {
            if(condition.test(name)) {
                System.out.println(name + " ");
            }
        }
    }

}
