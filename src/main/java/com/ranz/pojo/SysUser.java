package com.ranz.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @program: springMVC
 * @description:
 * @author: J.Flying
 * @create: 2020-09-16 11:20
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SysUser {

    private int id;
    private String name;
    private int age;
    private String userName;


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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
