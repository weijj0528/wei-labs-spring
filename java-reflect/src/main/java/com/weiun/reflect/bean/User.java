package com.weiun.reflect.bean;

/**
 * @author William
 * @Date 2019/3/20
 * @Description 用户
 */
@Deprecated
public class User extends People<User> {

    public static int TYPE_GOOD = 1;

    private static String TYPE_BAD = "0";

    public String name;

    private int age;

    private User() {
    }

    public User(String name) {
        this.name = name;
    }

    public User(String name, int age) {
        this.name = name;
        this.age = age;
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
}
