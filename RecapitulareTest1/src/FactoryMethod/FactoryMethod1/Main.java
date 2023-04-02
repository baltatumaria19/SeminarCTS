package FactoryMethod.FactoryMethod1;

//Agenția de turism AgeTur oferă pahete turistice cu cazare și transport însă
//are în ofertă și pachete turistice doar cu cazare sau doar cu transport.
//Toate ofertele fac parte din familia pachetelor turistice.

//Să se implementeze modulul de vânzare de pachete turistice pentru agenția AgeTur.


public class Main {
    public static void main(String[] args){

        IPacheteFactory PachetFactory1, PachetFactory2, PachetFactory3;

        IPachete pachet1 = null;

        PachetFactory1 = new PachetCazareFactory();
        pachet1= PachetFactory1.crearePachet();

        IPachete pachet2 = null;

        PachetFactory2 = new PachetTransportFactory();
        pachet2= PachetFactory2.crearePachet();

        IPachete pachet3 = null;

        PachetFactory3 = new PachetCazaresiTransportFactory();
        pachet3= PachetFactory3.crearePachet();

        pachet1.afisareDescriere();
        pachet2.afisareDescriere();
        pachet3.afisareDescriere();
    }
}
