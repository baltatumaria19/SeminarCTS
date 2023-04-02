package Builder.Builder2;

public class ContClientBuilder implements IContBancarBuilder{

    private ContClient cont;

    public ContClientBuilder() {
        this.cont = new ContClient();
    }

    @Override
    public void buildSalariu() {
        this.cont.setAreSalariu(true);
    }

    @Override
    public void buildCard() {
    this.cont.setAreCard(false);
    }

    @Override
    public void buildInternetBanking() {
    this.cont.setAreInternetBanking(false);
    }

    @Override
    public ContClient getCont() {
        return this.cont;
    }
}
