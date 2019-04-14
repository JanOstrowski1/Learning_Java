package com.infoshareacademy.homeworks;

public class Main {
    public static void main(String[] args) {
        final String[][] input = new String[][]{
                {"Ania", "5"},
                {"Tomek", "6"},
                {"Kasia", "3"},
                {"Albert", "2"},
                {"Ania", "3"},
                {"Tomek", "1"},
                {"Tomek", "4"},
                {"Bartek", "2"}
        };
        GradeService gradeService = new GradeService();
        gradeService.calculateAverage(input);
    }
}
