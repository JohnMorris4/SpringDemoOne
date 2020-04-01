package com.morrisje.springdemo;

public class FortuneServiceImpl implements FortuneService {
    @Override
    public String getFortune() {
        return "Today is the beginning of what you can achieve";
    }
}
