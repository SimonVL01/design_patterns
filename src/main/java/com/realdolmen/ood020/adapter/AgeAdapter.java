package com.realdolmen.ood020.adapter;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;

/**
 * Created by vdabcursist on 16/08/2017.
 */
public class AgeAdapter implements HasAge {

    private HasBirthDate hasBirthDate;
    //private Person p = new Person();

    public AgeAdapter(HasBirthDate hasBirthDate) {
        this.hasBirthDate = hasBirthDate;
    }

    @Override
    public long getAge() {
        return ChronoUnit.YEARS.between(hasBirthDate.getBirthDate(),
                LocalDate.now());
    }

}
