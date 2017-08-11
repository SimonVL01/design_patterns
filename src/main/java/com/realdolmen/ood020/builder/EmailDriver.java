package com.realdolmen.ood020.builder;

/**
 * Created by vdabcursist on 11/08/2017.
 */
public class EmailDriver {
    public static void main(String[] args) {
        Email e = new Email("Simon", "Mars", "Hello", "Blablabla");

        EmailHtmlFormat emailFormat = new EmailHtmlFormat();
        EmailConverter eC = new EmailConverter(emailFormat);
        eC.convertMail(e);
        EmailXmlFormat emailFormat1 = new EmailXmlFormat();
        EmailConverter eC2 = new EmailConverter(emailFormat1);
        eC2.convertMail(e);
        System.out.println(emailFormat.getHtml());
        System.out.println(emailFormat1.getXml());
    }
}
