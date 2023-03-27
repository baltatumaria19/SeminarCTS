package FactoryMethod;

public class Main {
    public static void main(String[] args) {

    AnimalFactory animalFactory1, animalFactory2, animalFactory3;

    animalFactory1 = new DogFactory();
    animalFactory1.createAnimal();

    animalFactory2 = new CatFactory();
    animalFactory2.createAnimal();

    animalFactory3 = new RabbitFactory();
    animalFactory3.createAnimal();
}
}
