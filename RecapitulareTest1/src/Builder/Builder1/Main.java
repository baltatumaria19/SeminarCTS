package Builder.Builder1;

//Atunci cand un client face o rezervare poate alege una din urmatoarele optiuni extra pentru locul sau:
//mancare inclusa, scaun ergonomic, bautura racoritoare inclusa, muzica ambientala personalizara, gen muzica.
//In cazul in care clientul nu specifica vreun element dintre acestea, este setat pe false.
//Sa se implementeze modulul care permite crearea de obiecte de tip rezervare cu aceste optiuni extra.

public class Main {

    public static void main (String[] args){
        IRezervareBuilder builder = new RezervareRestaurantBuilder();
        Receptioner receptioner = new Receptioner(builder);

        receptioner.buildRezervare();

        IRezervare rezervare = receptioner.getRezervare();
        System.out.println(rezervare.showDetails());
    }
}

