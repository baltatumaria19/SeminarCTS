package FactoryMethod.FactoryMethod2;

public class MedicFactory implements PersonalSpitalFactory{

    @Override
    public PersonalSpital crearePersonal() {
        return new Medic();
    }
}
