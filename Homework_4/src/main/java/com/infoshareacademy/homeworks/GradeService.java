package com.infoshareacademy.homeworks;

import java.text.DecimalFormat;
import java.util.*;

import static java.util.stream.Collectors.toList;

public class GradeService {

    public String[][] calculateAverage(String[][] data) {
        if (data == null || data.length == 0) {
            return new String[][]{{}};
        }
        List<Grade> listOfGrades = new ArrayList<>();
        for (int i = 0; i < data.length; i++) {
            String name = data[i][0];
            Double value = Double.parseDouble(data[i][1]);
            Grade grade = new Grade(name, value, 0);
            listOfGrades.add(grade);
        }
        listOfGrades = listOfGrades.stream()
                .sorted(Comparator.comparing(Grade::getPerson))
                .collect(toList());
        Set<String> names = new HashSet<>();
        listOfGrades.forEach(o -> names.add(o.getPerson()));
        while (listOfGrades.size() != names.size()) {
            for (int i = 0; i < listOfGrades.size(); i++) {
                for (int j = i + 1; j < listOfGrades.size(); j++) {
                    if (listOfGrades.get(i).getPerson().equals(listOfGrades.get(j).getPerson())) {
                        listOfGrades.get(i).setValue(listOfGrades.get(i).getValue()
                                + listOfGrades.get(j).getValue());
                        int duplicates = listOfGrades.get(i).getDuplicates() + 1;
                        listOfGrades.get(i).setDuplicates(duplicates);
                        listOfGrades.remove(listOfGrades.get(j));
                    }
                }
            }
        }
        String[][] newData = new String[names.size()][2];
        for (int i = 0; i < listOfGrades.size(); i++) {
            newData[i][0] = listOfGrades.get(i).getPerson();
            DecimalFormat decimalFormat = new DecimalFormat("#.00");
            Double average = listOfGrades.get(i).getValue()
                    / (listOfGrades.get(i).getDuplicates() + 1);
            String string = decimalFormat.format(average);
            newData[i][1] = string.replace(',', '.');
        }
        return newData;
    }
}
