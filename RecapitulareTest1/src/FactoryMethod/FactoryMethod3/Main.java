package FactoryMethod.FactoryMethod3;

//Restaurantul serveste mai multe tipuri de supe:supa de legume, supa de ciuperci, supa de vita, etc.
//Sa se implementeze modulul care permite realizarea de obiecte din familia supelor.
//Modulul trebuie realizat, astfel incat pentru adaugari de noi tipuri de supa sa nu fie necesare modificari in codul existent.

public class Main {

    public static void main(String[] args){

        ISupaFactory supaFactory1, supaFactory2, supaFactory3;

        supaFactory1 = new SupaLegumeFactory();
        supaFactory1.creareSupa();

        supaFactory2 = new SupaCiuperciFactory();
        supaFactory2.creareSupa();

        supaFactory3 = new SupaVitaFactory();
        supaFactory3.creareSupa();
    }
}

