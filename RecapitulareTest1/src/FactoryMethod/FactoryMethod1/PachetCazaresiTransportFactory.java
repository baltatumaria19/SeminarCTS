package FactoryMethod.FactoryMethod1;

public class PachetCazaresiTransportFactory implements IPacheteFactory {
    @Override
    public IPachete crearePachet(){
        return new PachetCazaresiTransport();
    }
}
