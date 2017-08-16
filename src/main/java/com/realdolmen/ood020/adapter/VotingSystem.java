package com.realdolmen.ood020.adapter;

/**
 * Created by vdabcursist on 16/08/2017.
 */
public class VotingSystem  {

    public boolean CanVote(HasAge hasAge) {
      return hasAge.getAge() >= 18;
    }
}
