package ru.progwards.java1.lessons.classes;

public class Duck extends Animal {
    Duck (double weight){
        super(weight);
    }
    @Override
    public AnimalKind getKind() {
        AnimalKind type = AnimalKind.DUCK;
        return type;
    }

    @Override
    public FoodKind getFoodKind() {
        FoodKind type = FoodKind.CORN;
        return type;

    }
    @Override public double getFoodCoeff(){return 0.04;}
}
