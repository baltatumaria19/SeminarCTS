package Singleton.Singleton2;

public class Main {
    public static void main(String[] args) throws  Exception{
        Angajat angajat1 = new Angajat("Marian");
        Angajat angajat2 = new Angajat("Maria");

        if(angajat1.getFirma() == angajat2.getFirma())
            System.out.println("Referinte identice");
        else
            System.out.println("Referintele nu sunt identice");

        angajat1.obtineIdUnic(2);
        System.out.println(angajat1.getFirma());
        angajat2.obtineIdUnic(5);
        System.out.println(angajat2.getFirma());
    }
}
