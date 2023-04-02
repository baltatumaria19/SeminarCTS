package Builder.Builder1;

public class Receptioner {

    private IRezervareBuilder builder;

    public Receptioner(IRezervareBuilder builder) {
        this.builder = builder;
    }

    public void buildRezervare(){

        this.builder.buildMancare();
        this.builder.buildBautura();
        this.builder.buildMuzica();
        this.builder.buildScaun();
        this.builder.buildGenMuzica();
    }

    public IRezervare getRezervare() {
        return this.builder.getRezervare();
    }
}
