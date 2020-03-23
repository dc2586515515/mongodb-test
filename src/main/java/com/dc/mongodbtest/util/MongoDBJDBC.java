package com.dc.mongodbtest.util;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoDatabase;

/**
 * @Description
 * @Author DC
 * @Date 2020-03-23
 */
public class MongoDBJDBC {
    public static void main(String[] args) {
        try {
            // 连接到Mongodb
            MongoClient mongoClient = new MongoClient("localhost", 27017);
            // 连接到数据库
            MongoDatabase testDatasource = mongoClient.getDatabase("test");
            System.out.println("Connect to database successfully");
        } catch (Exception e) {
            System.out.println(e.getClass().getName()+"："+e.getMessage());
        }
    }
}
