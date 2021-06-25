package com.tangh.test;

import redis.clients.jedis.Jedis;


public class Ping {

    public static void main(String[] args) {
        Jedis jedis = new Jedis("localhost",6379);
        System.out.println(jedis.set("username","tangh"));
        System.out.println(jedis.get("username"));
        System.out.println(jedis.keys("*"));
    }
}
