/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.lfa.dao;

import java.util.Scanner;

/**
 *
 * @author Hp
 */
public class CArraylist {
    private int id,duration;
    private String course_name,price,duration_type;

    public CArraylist() {
    }

    public CArraylist(int id, int duration, String course_name, String price, String duration_type) {
        this.id = id;
        this.duration = duration;
        this.course_name = course_name;
        this.price = price;
        this.duration_type = duration_type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getCourse_name() {
        return course_name;
    }

    public void setCourse_name(String course_name) {
        this.course_name = course_name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDuration_type() {
        return duration_type;
    }

    public void setDuration_type(String duration_type) {
        this.duration_type = duration_type;
    }

    @Override
    public String toString() {
        return "CArraylist{" + "id=" + id + ", duration=" + duration + ", course_name=" + course_name + ", price=" + price + ", duration_type=" + duration_type + '}';
    }

}