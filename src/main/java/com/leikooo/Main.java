package com.leikooo;

import java.util.TreeMap;

/**
 * @author <a href="https://github.com/lieeew">leikooo</a>
 * @date 2025/8/28
 * @description
 */
public class Main {
    public static void main(String[] args) {
        TreeMap<Users, String> treeMap = new TreeMap<>();
        Users users = new Users();
        users.setName("leikooo");
        users.setAge(10);

        Users users2 = new Users();
        users2.setName("leikooo2");
        users2.setAge(20);

        Users users3 = new Users();
        users3.setName("leikooo3");
        users3.setAge(-1);

        treeMap.put(users, users.getName());
        treeMap.put(users2, users2.getName());
        treeMap.put(users3, users3.getName());

        treeMap.forEach((k, v) -> System.out.println(k + " " + v));
    }
}