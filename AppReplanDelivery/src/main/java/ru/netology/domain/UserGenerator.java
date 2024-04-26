package ru.netology.domain;



import com.github.javafaker.Faker;

import java.util.Locale;

public class UserGenerator {
    private Faker faker;
    public UserGenerator(){
        this.faker = new Faker(new Locale("ru"));
    }

    public User generateUser(){
        return new User();
    }
    public void see(){
        User user = new User();
        System.out.println(user);
    }
}
