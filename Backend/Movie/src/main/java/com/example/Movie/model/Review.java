package com.example.Movie.model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "reviews")
public class Review {
    @Id
    private ObjectId id;
    private String body;

    // No-args constructor
    public Review() {
    }

    // All-args constructor
    public Review(ObjectId id, String body) {
        this.id = id;
        this.body = body;
    }
    public Review(String body) {
        this.body = body;
    }

    public ObjectId getId() {
        return id;
    }
    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getBody() {
        return body;
    }
    public void setBody(String body) {
        this.body = body;
    }

    @Override
    public String toString() {
        return "Review{" +
                "id=" + id +
                ", body='" + body + '\'' +
                '}';
    }
}
