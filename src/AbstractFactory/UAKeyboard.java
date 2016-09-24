package AbstractFactory;

public class UAKeyboard implements Keyboard {
    @Override
    public void print() {
        System.out.print("UA Print");
    }

    @Override
    public void println() {
        System.out.println("UA Println");
    }
}
