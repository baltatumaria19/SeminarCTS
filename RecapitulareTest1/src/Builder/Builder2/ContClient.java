package Builder.Builder2;

public class ContClient {

    private boolean areSalariu;
    private boolean areCard;
    private boolean areInternetBanking;

    public void setAreSalariu(boolean areSalariu) {
        this.areSalariu = areSalariu;
    }

    public void setAreCard(boolean areCard) {
        this.areCard = areCard;
    }

    public void setAreInternetBanking(boolean areInternetBanking) {
        this.areInternetBanking = areInternetBanking;
    }


    public String showDetails() {
        return "ContClient{" +
                "areSalariu=" + areSalariu +
                ", areCard=" + areCard +
                ", areInternetBanking=" + areInternetBanking +
                '}';
    }
}
