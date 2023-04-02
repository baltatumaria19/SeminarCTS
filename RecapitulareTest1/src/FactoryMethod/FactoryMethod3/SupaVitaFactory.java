package FactoryMethod.FactoryMethod3;

public class SupaVitaFactory implements ISupaFactory{

    @Override
    public Supa creareSupa() {
        return new SupaVita();
    }
}
