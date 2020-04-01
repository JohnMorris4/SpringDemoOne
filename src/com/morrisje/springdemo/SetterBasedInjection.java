package com.morrisje.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterBasedInjection {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        RugbyCoach theCoach = context.getBean("myRugbyCoach", RugbyCoach.class);

        System.out.println(theCoach.getDailyFortune());
        System.out.println(theCoach.getDailyWorkout());


        System.out.println("Email Address: "+ theCoach.getEmailAddress());
        System.out.println("Team: " + theCoach.getTeam());

        context.close();
    }
}
