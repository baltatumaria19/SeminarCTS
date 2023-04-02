package Singleton.Singleton2;

public class Angajat {
    private String NumeAngajat;
    private Firma firma;

    public Angajat(String NumeAngajat) throws Exception {
        this.NumeAngajat = NumeAngajat;
        firma = Firma.getInstance();
    }

    public void obtineIdUnic (int Nrid) {
        firma.setObtinereID(Nrid);
    }

    public Firma getFirma() {
        return firma;
    }
}
