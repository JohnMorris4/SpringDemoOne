package com.morrisje.springdemo;

public class RugbyCoach implements Coach {
    public FortuneService fortuneService;
    private String emailAddress;
    private String team;

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getTeam() {
        return team;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    //No Args constructor
    public RugbyCoach() {
        System.out.println("Rugby Coach");
    }
    //Setter Based Injection
    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("Inside the Setter method");
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Practice 45 mins of field work";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

}
