package com.example.demo.lambda;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

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
//        new Thread(()->System.out.println("java8新方式：lambda表达式")).start();

//        JButton show =  new JButton("Show");
//        show.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                System.out.println("传统方式");
//            }
//        });
//        show.addActionListener((e) -> {System.out.println("java8新方式：lambda表达式");});

//        List<String> list = new ArrayList();list.add("hello");list.add("world");
//        //传统方式
//        for (String word:list){
//            System.out.print(word);
//        }
//        System.out.println();
//        //java8新方式：lambda表达式
//        list.forEach(System.out::print);
//        list.forEach(word -> System.out.print(word));


//        List<String> languages = Arrays.asList("Java", "Scala", "C++", "Haskell", "Lisp");
//
//        System.out.println("Languages which starts with J :");
//        filter(languages, (str)->str.startsWith("J"));
//
//        System.out.println("Languages which ends with a ");
//        filter(languages, (str)->str.endsWith("a"));
//
//        System.out.println("Print all languages :");
//        filter(languages, (s)->true);
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
//        filter(languages, (str)->str.length() > 4);

    }

    public static void filter(List<String> names, Predicate<String> condition) {
        for(String name: names)  {
            if(condition.test(name)) {
                System.out.println(name + " ");
            }
        }
    }

}
