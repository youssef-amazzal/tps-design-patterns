package org.glsid;

public class Main {
    public static void main(String[] args) {
        Template template = new MoroccoTemplateImpl();
        System.out.println(template.perform(4,6));
        template = new SpainTemplateImpl();
        System.out.println(template.perform(4,6));
    }
}