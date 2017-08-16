package com.realdolmen.ood020.adapter;

import java.time.LocalDate;
import java.time.Month;

/**
 * Created by vdabcursist on 16/08/2017.
 */

public class AdapterTestDrive {
    public static void main(String[] args) {
        Person p = new Person(LocalDate.of(1991, Month.DECEMBER, 25));

        VotingSystem votingSystem = new VotingSystem();
        System.out.println(votingSystem.CanVote(new AgeAdapter(p)));
    }
}
