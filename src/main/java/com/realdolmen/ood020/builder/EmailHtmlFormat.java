package com.realdolmen.ood020.builder;

import javax.swing.text.html.HTMLDocument;
import javax.swing.text.html.HTMLEditorKit;
import javax.swing.text.html.parser.ParserDelegator;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by vdabcursist on 11/08/2017.
 */
public class EmailHtmlFormat extends EmailFormat {

    private String html = "";

    @Override
    public void createHeader() {
        html += "<!doctype html>\n" +
                "<html> <head>\n";
    }

    @Override
    public void createTitle(String title) {
        html += "<title>" + title + "</title> </head>";
    }

    @Override
    public void createFrom(String from) {
        html += "<body> <table> <tr><td>" + from + "</td></tr>";
    }

    @Override
    public void createTo(String to) {
        html += "<tr><td>" + to + "</td></tr>";
    }

    @Override
    public void createSubject(String subjects) {
        html += "<tr><td>" + subjects + "</td></tr>";
    }

    @Override
    public void createEmail(String email) {
        html += "<tr><td>" + email + "</td></tr> </table>";
    }

    @Override
    public void createFooter() {
        html += "</body> </html>";
    }

    public String getHtml() {
        return html;
    }
}
