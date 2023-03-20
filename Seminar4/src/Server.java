public class Server {
    int portNumber;
    String name;

    private static Server instance = null;

    private Server(int portNumber, String name){
        this.portNumber = portNumber;
        this.name = name;
    }

    public static Server getInstance(int portNumber, String name){

        //verificare instanta-> accesata anterior
        //daca este prima accesare-> Server.instance= new Server(); returnare Server.instance
        //daca nu este prima accesare-> returnare Server.instance

        if(instance == null){
            instance = new Server(portNumber, name);
        }
        return instance;
    }

    //public String Status;
    // return serverul "nume" ruleaza pe portul "port";

    public String Status(){
        return "Server " + name + " ruleaza pe portul " + portNumber;
    }

}



