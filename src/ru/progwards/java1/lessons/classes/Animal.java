package ru.progwards.java1.lessons.classes;

public class Animal {
double weight;
    enum AnimalKind {
        ANIMAL,
        COW,
        HAMSTER,
        DUCK,
    }
    enum FoodKind {UNKNOWN, HAY, CORN}

    Animal(double weight){
        this.weight=weight;
    }

    public AnimalKind getKind(){
        AnimalKind type=AnimalKind.ANIMAL;
        return type;
    }

    public FoodKind getFoodKind(){
        FoodKind type=FoodKind.UNKNOWN;
        return type;
    }

@Override
        public String toString(){
    return "I am "+getKind()+", eat "+getFoodKind();
        }

    public double getWeight() {
        return weight;
    }

    public double getFoodCoeff(){
        return 0.02;
    }
    public double calculateFoodWeight(){return getWeight()*getFoodCoeff();}

    public String toStringFull(){ return "I am " +getKind()+" eat "+getFoodKind()+" "+calculateFoodWeight();}



}

