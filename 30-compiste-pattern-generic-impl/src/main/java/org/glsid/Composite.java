package org.glsid;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Component {
    private final List<Component> components =new ArrayList<>();
    public Composite(String name) { super(name); }
    @Override
    public void print() {
        System.out.printf("%s📂 %s\n", "---".repeat(level), name);
        components.forEach(Component::print);
    }
    public void add(Component componant){
        componant.level=this.level+1; components.add(componant);
    }
    public void remove(Component componant){ components.remove(componant); }
    public List<Component> getChilds(){ return components; }
}
