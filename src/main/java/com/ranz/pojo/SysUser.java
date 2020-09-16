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



}
