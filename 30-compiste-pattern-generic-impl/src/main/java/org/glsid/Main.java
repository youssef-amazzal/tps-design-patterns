package org.glsid;

public class Main {
    public static void main(String[] args) {
        Composite root = new Composite("root");
        Composite folder1 = new Composite("folder 1");
        Composite folder2 = new Composite("folder 2");

        root.add(folder1);
        root.add(folder2);

        root.add(new Element("file 1"));
        root.add(new Element("file 2"));
        root.add(new Element("file 3"));

        folder1.add(new Element("file 1.1"));
        folder1.add(new Element("file 1.2"));
        folder2.add(new Element("file 2.1"));
        folder2.add(new Element("file 2.2"));

        root.print();
    }
}