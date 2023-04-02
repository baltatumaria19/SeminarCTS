package Singleton.Singleton1;

public class AgentVanzari {

    private String nume;

    private Agentie agentie;

    public AgentVanzari(String nume) throws Exception{
        this.nume = nume;
        agentie = Agentie.getInstance();
    }

    public void vindePachet(int nrPachet){
        agentie.setPachetVandut(nrPachet);
    }

    public Agentie getAgentie(){
        return agentie;
    }
}
