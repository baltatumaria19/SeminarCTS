package AbstractFactory;

public class WindowsMenu implements Menu{
    public WindowsMenu(){
        System.out.println("WindowsMenu creat");
    }

    @Override
    public void show() {
        System.out.println("Windows menu");
    }
}
