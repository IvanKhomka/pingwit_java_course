package com.pingwit_java_course.part9.homework.task2;

public class MatchmakingService {
    public void offerDatingService(Person person) { // offerDatingService - старайся не использовать в названии слово Сервис, можно назвать checkRegistrationAvailability/askForDating и т.д.
        if (person.getAge() > 18 && person.maritalStatus == MaritalStatus.SINGLE) { // 18 - это магическое число, в константу; person.maritalStatus == MaritalStatus.SINGLE -> MaritalStatus.SINGLE == person.maritalStatus
            if (person.gender == Gender.MALE) { // лучше поменять местами Gender.MALE == person.gender, NPE не будет, то так правильнее
                System.out.println("Уважаемый " + person.firstName + ", желаете ли познакомиться с девушкой?");
            } else { // для данной задачи не критично, но я бы рекомендовал не else, а if-else, вдруг программа начнет поддерживать другие гендеры
                System.out.println("Уважаемая " + person.firstName + ", мы поможем вам найти мужчину мечты!");
            }
        }
    }
}
