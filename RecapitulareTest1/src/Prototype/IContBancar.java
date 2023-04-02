package Prototype;

public interface IContBancar extends Cloneable{
    void setBuletin(String buletin);
    void setCardCredit(String card);

    void generateCard();

    IContBancar clone() throws CloneNotSupportedException;
}
