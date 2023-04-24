package Facade.ex2;

public class DealerAuto {

    private MasinaElectrica masinaElectrica;
    private MasinaFamilie masinaFamilie;
    private MasinaSport masinaSport;

    public DealerAuto() {
        masinaElectrica = new MasinaElectrica();
        masinaFamilie = new MasinaFamilie();
        masinaSport = new MasinaSport();
    }

    public void descriereMasinaElectrica() {
        masinaElectrica.descriere();
    }

    public void descriereMasinaFamilie() {
        masinaFamilie.descriere();
    }

    public void descriereMasinaSport() {
        masinaSport.descriere();
    }

}
