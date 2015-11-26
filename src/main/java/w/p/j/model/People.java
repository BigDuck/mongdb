/*
 * Copyright (c) 2015 - 11 - 26  11 : 11 :10
 * @author wupeiji It will be
 * @Email wpjlovehome@gmail.com
 */

package w.p.j.model;

import org.springframework.data.annotation.Id;

import java.io.Serializable;

/**
 * Name：People
 * Time：2015/11/26 23:11
 * author：WPJ587
 * description：实体类
 **/

public class People implements Serializable {

    private String name;
    private String address;
    private int age;
    /**
     * mongodb默认的会添加的属性
     */
    @Id
    private String id;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public People() {
    }

    public People(String name, String address, int age) {
        this.name = name;
        this.address = address;
        this.age = age;
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", age=" + age +
                ", id='" + id + '\'' +
                '}';
    }
}
