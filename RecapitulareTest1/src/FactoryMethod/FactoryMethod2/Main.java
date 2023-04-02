package FactoryMethod.FactoryMethod2;

//In cadrul aplicatiei, personalul spitalului este de mai multe tipuri: Brancardier, Asistent, Medic.
//Sa se implementeze modulul care pune la dispozitie crearea de obiecte din familia obiectelor PersonalSpital.
//Modulul trebuie realizat, astfel incat pentru adaugari de noi tipuri de personal sa nu fie necesare modificari in codul existent.

public class Main {
    public static void main (String[] args){

        PersonalSpitalFactory PersonalSpitalF1, PersonalSpitalF2, PersonalSpitalF3;

        PersonalSpitalF1= new BrancardierFactory();
        PersonalSpitalF1.crearePersonal();

        PersonalSpitalF2= new AsistentFactory();
        PersonalSpitalF2.crearePersonal();

        PersonalSpitalF3 = new MedicFactory();
        PersonalSpitalF3.crearePersonal();

    }
}
