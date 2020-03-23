package com.dc.mongodbtest.useMongo;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

/**
 * @Description 创建集合 && 获取集合
 * @Author DC
 * @Date 2020-03-23
 */
public class mogoCollection {
    public static void main(String[] args) {
        try {
            // 连接到数据库
            MongoClient mongoClient = new MongoClient("localhost", 27017);
            MongoDatabase mongoDatabase = mongoClient.getDatabase("test");
            System.out.println("Connect to database successfully");
            //创建结合
            // mongoDatabase.createCollection("java_create");
            // System.out.println("集合创建成功");

            // 获取集合
            MongoCollection<Document> collection = mongoDatabase.getCollection("java_create");
            System.out.println("集合 java_create 选择成功");
        } catch (Exception e) {
            System.out.println(e.getClass().getName() + ": " + e.getMessage());
        }
    }
}
