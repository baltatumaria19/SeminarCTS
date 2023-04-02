package Builder.Builder1;

public class RezervareRestaurant implements IRezervare{

   private boolean areMancare;
   private boolean areScaun;
   private boolean areBautura;
   private boolean areMuzica;
   private String  genMuzica;

    public void setAreMancare(boolean areMancare) {
        this.areMancare = areMancare;
    }

    public void setAreScaun(boolean areScaun) {
        this.areScaun = areScaun;
    }

    public void setAreBautura(boolean areBautura) {
        this.areBautura = areBautura;
    }

    public void setAreMuzica(boolean areMuzica) {
        this.areMuzica = areMuzica;
    }

    public void setGenMuzica(String genMuzica) {
        this.genMuzica = genMuzica;
    }

    public String showDetails() {
        return "Rezervare{" +
                "areMancare=" + areMancare +
                ", areScaun=" + areScaun +
                ", areBautura=" + areBautura +
                ", areMuzica=" + areMuzica +
                ", GenMuzica=" + genMuzica +
                '}';
    }
}
