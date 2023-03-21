package ma.usmba.composite;

public abstract class Component {
    protected String name;
    protected int level;

    public Component(String name) {
        this.name = name;
    }

    public abstract void print();

    public String getTab(){
        String tab="";
        for (int i = 0; i < level; i++) {
            tab=tab+"\t";
        }
        return tab;
    }
}
