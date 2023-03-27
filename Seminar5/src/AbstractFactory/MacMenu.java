package AbstractFactory;

public class MacMenu implements Menu{
    public MacMenu(){
        System.out.println("MacMenu creat");
    }

    @Override
    public void show() {
        System.out.println("Mac menu");
    }
}
