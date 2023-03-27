package AbstractFactory;

public class WindowsButton implements Button{
    public WindowsButton(){
        System.out.println("WindowsButton creat");
    }

    @Override
    public void show() {
        System.out.println("Windows button");
    }
}
