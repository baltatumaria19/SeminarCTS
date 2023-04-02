package Prototype;

public class ContClient implements IContBancar{
    private String buletin;
    private String cardCredit;

    public void setBuletin(String buletin) {
        this.buletin = buletin;
    }

    public void setCardCredit(String cardCredit) {
        this.cardCredit = cardCredit;
    }

    @Override
    public void generateCard() {
        System.out.println("Card pentru clientul cu buletinul " + buletin + " si cu cardul de credit " + cardCredit);
    }

    @Override
    public IContBancar clone() throws CloneNotSupportedException {
        return (ContClient) super.clone();
    }


}
