package com.ttn.springbootdemo.entity;

import org.springframework.beans.factory.annotation.Value;

public class DataBase {
    @Value("${server.port}")
    private int port;
    @Value("${server.name}")
    private String name;

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "DataBase{" +
                "port=" + port +
                ", name='" + name + '\'' +
                '}';
    }
}
