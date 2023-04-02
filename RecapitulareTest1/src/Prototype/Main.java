package Prototype;

//Banca doreste sa implementeze un modul in cadrul aplicatiei, astfel incat daca un client detine deja un cont la banca
// si doreste deschiderea unui nou cont sa nu fie necesara construirea datelor despre respectivul client,
//deoarece prin construire clientul trebuie sa prezinte iar documentele necesare precum buletin si cardul de credit pentru plata.

public class Main {
    public static void main(String[] args){
        GeneratorCont generatorCont = new GeneratorCont();
        IContBancar contClient = generatorCont.generateCard("Cont client", "Buletin", "5555254544");
    }
}
