package FactoryMethod.FactoryMethod1;

public class PachetCazaresiTransport implements IPachete {

    @Override
    public void afisareDescriere() {
        System.out.println("Pachetul contine cazare si transport");
    }
}
