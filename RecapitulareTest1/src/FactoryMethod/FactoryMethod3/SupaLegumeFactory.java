package FactoryMethod.FactoryMethod3;

public class SupaLegumeFactory implements ISupaFactory {

    @Override
    public Supa creareSupa() {
        return new SupaLegume();
    }
}
