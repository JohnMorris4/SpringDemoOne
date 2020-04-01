package com.morrisje.springdemo;

public class TrackCoach implements Coach {

    private FortuneService fortuneService;

    public TrackCoach() {
    }

    public TrackCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Track Coach workout";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
