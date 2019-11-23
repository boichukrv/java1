package ru.progwards.java1.lessons.classes;

public class ComplexNum {
    int a = 0;
    int b = 0;

    public ComplexNum(int a, int b) {
        this.a = a;
        this.b = b;
    }

    // @Override
    public String toString() {
        return a + "+"+ b + "i";
    }

    public ComplexNum add(ComplexNum num1, ComplexNum num2) {
            return new ComplexNum(num1.a +num2.a,num1.b+num2.b);
}

    public ComplexNum sub(ComplexNum num1, ComplexNum num2){
        return new ComplexNum(num1.a -num2.a,num1.b-num2.b);
    }

   //====================
    (a*c - b*d) + (b*c + a*d)i

    public ComplexNum mul(ComplexNum num1, ComplexNum num2){
           return new ComplexNum((num1.a*num2.a-num1.b*num2.b),(num1.b*num2.a+num1.a*num2.b));
    }

    public ComplexNum div(ComplexNum num1, ComplexNum num2) {
        return new ComplexNum((num1.a * num2.a + num1.b * num2.b) / (num2.a * num2.a + num2.b * num2.b), (num1.b * num2.a - num1.a * num2.b) / (num2.a * num2.a + num2.b * num2.b));
    }

    public static void main(String[] args) {

    }
}
