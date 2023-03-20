public class Main {

    //testare instantiere obiect nou Server x = new server
    //preluare instanta Singleton

    public static void main(String[] args){
        Server x = Server.getInstance(11, "server1");
        Server y = Server.getInstance(25,"server5");

        System.out.println(x.Status());
        System.out.println(y.Status());
    }
}
