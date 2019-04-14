package com.infoshareacademy.homeworks;

public class Grade {
    private Double value ;
    private String person ;
    private int duplicates ;

    public int getDuplicates() {
        return duplicates;
    }

    public void setDuplicates(int duplicates) {
        this.duplicates = duplicates;
    }

    public Grade(String person , Double value,int duplicates){
        this.person = person;
        this.value = value ;
        this.duplicates=duplicates;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public String getPerson() {
        return person;
    }
}
