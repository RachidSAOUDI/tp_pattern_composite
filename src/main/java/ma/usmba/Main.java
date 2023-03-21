package ma.usmba;

import ma.usmba.composite.Folder;

public class Main {
    public static void main(String[] args) {
        Folder folder=new Folder("/");
        folder.print();
    }
}
