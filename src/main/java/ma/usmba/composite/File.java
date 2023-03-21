package ma.usmba.composite;

public class File extends Component {
    public File(String name) {
        super(name);
    }

    @Override
    public void print() {

        System.out.println(getTab()+"File : "+name);
    }
}
