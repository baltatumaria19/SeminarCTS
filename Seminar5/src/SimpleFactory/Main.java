package SimpleFactory;

public class Main {

    public static void main(String[] args) {

        PizzaFactory.createPizza("Cheese");
        PizzaFactory.createPizza("Pepperoni");
        PizzaFactory.createPizza("Vegetariana");
    }
}