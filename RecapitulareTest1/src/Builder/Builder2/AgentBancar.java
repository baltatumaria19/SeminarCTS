package Builder.Builder2;

public class AgentBancar {

    private IContBancarBuilder builder;

    public AgentBancar(IContBancarBuilder builder) {
        this.builder = builder;
    }

    public void buildCont(){
        this.builder.buildSalariu();
        this.builder.buildCard();
        this.builder.buildInternetBanking();
    }

    public ContClient getCont(){
        return this.builder.getCont();
    }
}
