package com.realdolmen.ood020.adapter;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;

/**
 * Created by vdabcursist on 16/08/2017.
 */
public class Person implements HasBirthDate {
    private LocalDate birthDate;
    //private LocalDate currentDate;

    public Person(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public Person() {
    }

    @Override
    public LocalDate getBirthDate() {
        return birthDate;
    }

/*    public LocalDate getCurrentDate() {
        return currentDate;
    }

    public void setCurrentDate(LocalDate currentDate) {
        this.currentDate = currentDate;
    }*/
}
