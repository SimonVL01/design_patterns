package com.realdolmen.ood020.builder;

import java.io.IOException;

/**
 * Created by vdabcursist on 11/08/2017.
 */
public class EmailConverter {
    private EmailFormat emailFormat;

    public EmailConverter(EmailFormat emailFormat) {
        this.emailFormat = emailFormat;
    }

    public void convertMail(Email email) {
        emailFormat.createHeader();
        emailFormat.createTitle(email.getSubject());
        emailFormat.createFrom(email.getFrom());
        emailFormat.createTo(email.getTo());
        emailFormat.createTo(email.getSubject());
        emailFormat.createEmail(email.getEmail());
        emailFormat.createFooter();
    }
}
