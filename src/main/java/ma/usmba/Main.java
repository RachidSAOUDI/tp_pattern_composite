package ma.usmba;

import ma.usmba.composite.Component;
import ma.usmba.composite.File;
import ma.usmba.composite.Folder;

public class Main {
    public static void main(String[] args) {
        Folder folder=new Folder("/");
        folder.addChild(new File("Test.java"));
        folder.addChild(new File("config.xml"));
        Folder entities = (Folder) folder.addChild(new Folder("entities"));
        Folder repositories = (Folder) folder.addChild(new Folder("repositories"));
        folder.print();
    }
}
