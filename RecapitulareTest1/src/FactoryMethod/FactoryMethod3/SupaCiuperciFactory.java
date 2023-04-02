package FactoryMethod.FactoryMethod3;

public class SupaCiuperciFactory implements ISupaFactory{

    @Override
    public Supa creareSupa() {
        return new SupaCiuperci();
    }
}
