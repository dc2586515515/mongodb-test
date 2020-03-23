package com.dc.mongodbtest;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoDatabase;

/**
 * @Description
 * @Author DC
 * @Date 2020-03-19
 */
public class MongoTest {
    public static void main(String[] args) {
        // 连接到mongodb
        MongoClient mongoClient = new MongoClient("localhost", 27017);
        //连接到数据库
        MongoDatabase mongoDatabase = mongoClient.getDatabase("test");
        System.out.println("Connect to database successfully");
        // 创建集合
        System.out.println("=========开始创建集合==========");
        mongoDatabase.createCollection("java_collection");
        System.out.println("=========创建集合成功==========");
    }
}
