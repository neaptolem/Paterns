package AbstractFactory;

public class ENKeyboard implements Keyboard{
    @Override
    public void print() {
        System.out.print("EN Print");
    }

    @Override
    public void println() {
        System.out.println("EN Println");

    }
}
