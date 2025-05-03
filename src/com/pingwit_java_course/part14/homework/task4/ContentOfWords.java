package com.pingwit_java_course.part14.homework.task4;

public class ContentOfWords {
    public static void main(String[] args) {
        String text = """
                While major gameplay components,
                are already in place and functioning, players help is needed to add some
                of the smaller features and content. Of course polishing the overall experience is important
                at the same time. Game has been extensively tested in closed group, but it is always important
                to hear fresh suggestions from larger crowd that come from various gaming backgrounds. Plan is to
                make the game as good as possible but without compromising the core idea.
                """;

        int alertCount = countWordOccurrences(text, "alert");
        int addCount = countWordOccurrences(text, "add");
        int goodCount = countWordOccurrences(text, "good");
        int planCount = countWordOccurrences(text, "plan");

        System.out.println("The word 'alert' meets " + alertCount + " times");
        System.out.println("The word 'add' meets " + addCount + " times");
        System.out.println("The word 'good' meets " + goodCount + " times");
        System.out.println("The word 'plan' meets " + planCount + " times");
    }

    /*
    Давай немного упростим твой вариант. Алгоритм
    1. Разбиваем весь текст на массив
    2. Бежим по полученному массиву и считаем кол-во совпадений при помощи метода c******s()
     */
    public static int countWordOccurrences(String text, String word) {
        int count = 0;
        int fromIndex = 0;
        text = text.toLowerCase();
        word = word.toLowerCase();

        while ((fromIndex = text.indexOf(word, fromIndex)) != -1) {
            if ((fromIndex == 0 || !Character.isLetterOrDigit(text.charAt(fromIndex - 1))) &&
                    (fromIndex + word.length() == text.length() || !Character.isLetterOrDigit(text.charAt(fromIndex + word.length())))) {
                count++;
            }
            fromIndex += word.length();
        }
        return count;
    }
}