package ru.progwards.java1.lessons.classes;

public class Cow extends Animal {

    Cow (double weight){
    super(weight);
}
    @Override
    public AnimalKind getKind() {
        AnimalKind type = AnimalKind.COW;
        return type;
    }

    @Override
    public FoodKind getFoodKind() {
        FoodKind type = FoodKind.HAY;
        return type;

    }
    @Override public double getFoodCoeff(){return 0.05;}

}
