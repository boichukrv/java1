package ru.progwards.java1.lessons.basics;

public class ReverseDigits {
    public static int reverseDigits(int number){
        int num1,num2,num3;
        num1=number/100;           //первая цифра исходного числа
        num2=(number-num1*100)/10; //вторая цифра исходного числа
        num3=number%10;            //третья цифра исходного числа
        return num3*100+num2*10+num1;
        /*если записать без переменных, получим выражение вида
       return number/100 + ((number-( number/100 )*100)/10)*10 + (number%10)*100;*/
    }

    public static void main(String[] args) {

    }

}
