package com.dc.mongodbtest.useMongo;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description 插入文档
 * @Author DC
 * @Date 2020-03-23
 */
public class insertMany {

    public static void main(String[] args) {
        try {
            // 连接到 mongodb 服务
            MongoClient mongoClient = new MongoClient( "localhost" , 27017 );

            // 连接到数据库
            MongoDatabase mongoDatabase = mongoClient.getDatabase("test");
            System.out.println("Connect to database successfully");

            // 获取集合
            MongoCollection<Document> collection = mongoDatabase.getCollection("java_create");
            System.out.println("集合 java_create 选择成功");

            //插入文档
            /**
             * 1. 创建文档 org.bson.Document 参数为key-value的格式
             * 2. 创建文档集合List<Document>
             * 3. 将文档集合插入数据库集合中 mongoCollection.insertMany(List<Document>)
             * 插入单个文档可以用 mongoCollection.insertOne(Document)
             * */
            Document document = new Document("title", "MongoDB").
                    append("description", "database").
                    append("likes", 100).
                    append("by", "DC");

            Document document2 = new Document("title", "坤哥").
                    append("description", "很狂").
                    append("likes", 100).
                    append("by", "坤爸坤妈");
            List<Document> documents = new ArrayList<Document>();
            documents.add(document);
            documents.add(document2);
            // 插入文档
            collection.insertMany(documents);
            System.out.println("插入文档成功");
        }catch (Exception e){
            System.err.println( e.getClass().getName() + ": " + e.getMessage() );
        }
    }

}
