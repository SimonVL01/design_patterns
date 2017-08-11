package com.realdolmen.ood020.builder;

/**
 * Created by vdabcursist on 11/08/2017.
 */
public class Email {
    private String from;
    private String to;
    private String subject;
    private String email;

    public Email(String from, String to, String subject, String email) {
        this.from = from;
        this.to = to;
        this.subject = subject;
        this.email = email;
    }

    public Email() {
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Email{" +
                "from='" + from + '\'' +
                ", to='" + to + '\'' +
                ", subject='" + subject + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
