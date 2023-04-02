package Builder.Builder1;

public interface IRezervare {

    public void setAreMancare(boolean areMancare);
    public void setAreScaun(boolean areScaun);
    public void setAreBautura(boolean areBautura);
    public void setAreMuzica(boolean areMuzica);
    public void setGenMuzica(String genMuzica);

    public String showDetails();
}
