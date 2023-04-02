package Builder.Builder1;

public class RezervareRestaurantBuilder implements IRezervareBuilder {

    private IRezervare rezervare;

    public RezervareRestaurantBuilder() {
        this.rezervare = new RezervareRestaurant();
    }

    @Override
    public void buildMancare() {
    this.rezervare.setAreMancare(false);
    }

    @Override
    public void buildScaun() {
    this.rezervare.setAreScaun(false);
    }

    @Override
    public void buildBautura() {
    this.rezervare.setAreBautura(true);
    }

    @Override
    public void buildMuzica() {
    this.rezervare.setAreMuzica(true);
    }

    @Override
    public void buildGenMuzica() {
    this.rezervare.setGenMuzica("Reggae");
    }

    @Override
    public IRezervare getRezervare() {
        return this.rezervare;
    }
}
