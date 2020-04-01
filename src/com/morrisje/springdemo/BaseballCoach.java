package com.morrisje.springdemo;

public class BaseballCoach  implements Coach{
    private FortuneService fortuneService;

    public BaseballCoach() {
    }

    public BaseballCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout(){
        return "Spent 30 mins in batting cage";
    }

    @Override
    public String getDailyFortune() {
        return "You are a winner " + fortuneService.getFortune();
    }
}
