package Builder.Builder2;

//Banca pune la dispozitie clientilor posibilitatea de creare de conturi pentru care
//daca un client doreste poate sa seteze sa fie contul in care sa primeasca salariul, sa fie cu card atasat sau sa aiba internet banking.
//In cazul in care clientul nu seteaza aceste informatii, contul este creat fara aceste facilitati.

public class Main {

    public static void main (String[] args){

        IContBancarBuilder builder = new ContClientBuilder();
        AgentBancar agent = new AgentBancar(builder);

        agent.buildCont();

        ContClient cont = agent.getCont();
        System.out.println(cont.showDetails());
    }
}
