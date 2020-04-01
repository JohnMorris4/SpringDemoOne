package com.morrisje.springdemo;

public class HockeyCoach implements Coach {
    private FortuneService fortuneService;

    public HockeyCoach() {
    }

    public HockeyCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Game Time is 6pm. Ice practice is 5pm";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
