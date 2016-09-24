package delegate;


public class Main {
    static public void main(String[] args){
        Painter painter=new Painter();
        painter.setShape(new Square());
        painter.draw();

        painter.setShape(new Circle());
        painter.draw();

        painter.setShape(new Triangle());
        painter.draw();

    }
}
