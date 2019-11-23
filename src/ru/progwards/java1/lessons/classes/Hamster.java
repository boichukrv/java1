package ru.progwards.java1.lessons.classes;

public class Hamster extends Animal {

    Hamster(double weight) {
        super(weight);
    }

    @Override
    public AnimalKind getKind() {
        AnimalKind type = AnimalKind.HAMSTER;
        return type;
    }

    @Override
    public FoodKind getFoodKind() {
        FoodKind type = FoodKind.CORN;
        return type;

    }

    @Override
    public double getFoodCoeff() {
        return 0.03;
    }


    public static void main(String[] args) {
        Hamster A1 = new Hamster(12.3);
    }

}