package Singleton.Singleton1;


public class Agentie {

    private static int nrPachete = 10;
    private boolean pacheteVandute[] = new boolean[nrPachete];

    //referinta la instanta unica
    private static Agentie instance = null;

    //constructor privat
    private Agentie() throws Exception{
        if(instance != null)
            throw new Exception("Obiectul a fost creat deja");
    }

    //metoda publica
     public static Agentie getInstance() throws Exception{
        if(instance == null)
            instance = new Agentie();
        return instance;
     }


     public void setPachetVandut(int i){
        if (i>= 0 && i < nrPachete && pacheteVandute[i] == false){
            pacheteVandute[i] = true;
        }
     }

    @Override
    public String toString() {
        return "Agentie{" +
                "pacheteVandute=" + java.util.Arrays.toString(pacheteVandute) +
                '}';
    }
}
