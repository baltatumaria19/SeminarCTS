package FactoryMethod.FactoryMethod2;

public class BrancardierFactory implements PersonalSpitalFactory {

    @Override
    public PersonalSpital crearePersonal() {
        return new Brancardier();
    }
}