package org.glsid;

public class Element extends Component {
    public Element(String name) {
        super(name);
    }

    @Override
    public void print() {
        System.out.printf("%s📄 %s\n", "---".repeat(level), name);
    }
}
