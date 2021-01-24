package com.course.entity;

import java.io.Serializable;

/**
 * 课程类与价格类整合
 */
public class CourseAndPrice implements Serializable {
    private int id;
    private int courseId;
    private String name;
    private int price;

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "CourseAndPrice{" +
                "id=" + id +
                ", courseId=" + courseId +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
