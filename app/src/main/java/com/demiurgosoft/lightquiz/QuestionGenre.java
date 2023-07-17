package com.demiurgosoft.lightquiz;

/**
 * Created by demiurgosoft - 5/12/15
 */
public enum QuestionGenre {
    CITY, FOOD, MATH, SCIENCE,HISTORY,SPORTS,GEOGRAPHY,ANIMAL;


    public static String[] names() {
        QuestionGenre[] questions = QuestionGenre.values();
        String[] result = new String[questions.length];

        for (int i = 0; i < questions.length; i++) {
            result[i] = questions[i].toString();
        }
        return result;
    }

}
