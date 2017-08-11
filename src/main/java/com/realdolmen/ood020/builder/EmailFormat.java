package com.realdolmen.ood020.builder;

/**
 * Created by vdabcursist on 11/08/2017.
 */
public abstract class EmailFormat {
    public abstract void createHeader();
    public abstract  void createTitle(String title);
    public abstract void createFrom(String from);
    public abstract void createTo(String to);
    public abstract void createSubject(String subjects);
    public abstract void createEmail(String email);
    public abstract void createFooter();

}
