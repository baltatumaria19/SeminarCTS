package FactoryMethod.FactoryMethod1;

public class PachetTransportFactory implements IPacheteFactory {
    @Override
    public IPachete crearePachet(){
        return new PachetTransport();
    }
}
