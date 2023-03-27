package AbstractFactory;

public class MacButton implements Button{
    public MacButton(){
        System.out.println("MacButton creat");
    }

    @Override
    public void show() {
        System.out.println("Mac button");
    }
}
