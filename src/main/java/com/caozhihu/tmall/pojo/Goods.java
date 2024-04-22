package com.caozhihu.tmall.pojo;

public class Goods {
    private int id;
    private String name;
    private double price;

    private int num;
    private String type;
    private String time;
    private String oldtime;
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getOldtime() {
        return oldtime;
    }

    public void setOldtime(String oldtime) {
        this.oldtime = oldtime;
    }
}
