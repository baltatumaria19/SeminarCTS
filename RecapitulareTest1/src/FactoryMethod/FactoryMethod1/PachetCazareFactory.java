package FactoryMethod.FactoryMethod1;

public class PachetCazareFactory implements IPacheteFactory {

    @Override
    public IPachete crearePachet() {

        return new PachetCazare();
    }
}
