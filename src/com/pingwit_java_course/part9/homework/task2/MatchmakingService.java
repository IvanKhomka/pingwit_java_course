package com.pingwit_java_course.part9.homework.task2;

public class MatchmakingService {
    public void offerDatingService(Person person) {
        if (person.getAge() > 18 && person.maritalStatus == MaritalStatus.SINGLE) {
            if (person.gender == Gender.MALE) {
                System.out.println("Уважаемый " + person.firstName + ", желаете ли познакомиться с девушкой?");
            } else {
                System.out.println("Уважаемая " + person.firstName + ", мы поможем вам найти мужчину мечты!");
            }
        }
    }
}
