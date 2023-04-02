package Singleton.Singleton1;

public class Main {

    public static void main (String[] args) throws Exception {
        AgentVanzari agent1 = new AgentVanzari("George");
        AgentVanzari agent2 = new AgentVanzari("Ioana");
        if (agent1.getAgentie() == agent2.getAgentie())
            System.out.println("Referinta identica");
        else
            System.out.println("Referintele nu sunt identice");

        agent1.vindePachet(3);
        System.out.println(agent1.getAgentie());
        agent2.vindePachet(5);
        System.out.println(agent2.getAgentie());
    }
}
