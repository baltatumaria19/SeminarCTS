package Decorator;

public class Main {
    public static void main(String[] args){
        Subscription subscription = new BasicSubscription();
        subscription = new OfflineViewingDecorator(subscription);
        subscription = new HDStreamingDecorator(subscription);

        System.out.println("Descriere "+ subscription.getDescription());
        System.out.println("Pret " + subscription.getPrice());
    }
}
