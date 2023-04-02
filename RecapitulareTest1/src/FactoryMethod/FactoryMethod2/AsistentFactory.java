package FactoryMethod.FactoryMethod2;

public class AsistentFactory implements PersonalSpitalFactory{

    @Override
    public PersonalSpital crearePersonal() {
        return new Asistent();
    }
}
