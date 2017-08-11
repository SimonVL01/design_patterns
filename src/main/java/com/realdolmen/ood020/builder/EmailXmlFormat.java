package com.realdolmen.ood020.builder;

import sun.plugin.dom.core.Document;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.IOException;

/**
 * Created by vdabcursist on 11/08/2017.
 */
public class EmailXmlFormat extends EmailFormat {

    private String xml = "";

    @Override
    public void createHeader() {
        xml +=
                "<?xml version=”1.0” encoding=“UTF-8”?> <message>";
    }

    @Override
    public void createTitle(String title) {

    }

    @Override
    public void createFrom(String from) {
        xml += "<from>" + from + "</from>";
    }

    @Override
    public void createTo(String to) {
        xml += "<tr><td>" + to + "</td></tr>";
    }

    @Override
    public void createSubject(String subjects) {
        xml += "<tr><td>" + subjects + "</td></tr>";
    }

    @Override
    public void createEmail(String email) {
        xml += "<tr><td>" + email + "</td></tr>";
    }

    @Override
    public void createFooter() {
        xml += "</message>";
    }

    public String getXml() {
        return xml;
    }
}
