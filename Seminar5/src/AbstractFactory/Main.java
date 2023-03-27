package AbstractFactory;

public class Main {
    public static void main(String[] args) {
        GUIFactory guiFactory1, guiFactory2;

        guiFactory1 = new WindowsGUIFactory();
        guiFactory1.createButton();
        guiFactory1.createMenu();

        guiFactory2 = new MacGUIFactory();
        guiFactory2.createButton();
        guiFactory2.createMenu();
    }
}
