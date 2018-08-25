package com.imooc.gradle;

/**
 * @author Lucifer
 * @do repository
 * @date 2018/08/25 11:26
 */
public class UserRepository {

    public User create(){
        User user = new User();
        user.setName("some body");
        user.setSex("F");
        return user;
    }

}
