package Prototype;

import java.util.HashMap;
import java.util.Map;

public class GeneratorCont {

    private Map<String, IContBancar> carduri = new HashMap<>();

    public GeneratorCont() {
        carduri.put("Cont client", new ContClient());
    }

    public IContBancar generateCard(String tip, String buletin, String contClient){
        try{
            IContBancar contBancar = carduri.get(tip).clone();
            contBancar.setBuletin(buletin);
            contBancar.setCardCredit(contClient);
            contBancar.generateCard();
            return contBancar;
        } catch (CloneNotSupportedException e) {
            System.out.println("Error cloning report prototype: "+ e.getMessage());
            return null;
        }
    }
}
