package ru.progwards.java1.lessons.compare_if_cycles;

public class CyclesGoldenFibo {

    public static boolean containsDigit(int number, int digit) {
        int a;
        int count=String.valueOf(Math.abs(number)).length();//узнаем длину числа number
        for (int i=0; i<count;i++){
            a=number%10;                                    //запоминаем последнюю цифру
            number=(number-a)/10;                           //убираем последнюю цифру из числа number
            if (a==digit)return true;                       //сравниваем последнюю цифру числа и цифру digit
            }
        return false;
    }

    public static int fiboNumber(int n){
    int prev1=1;
    int prev2=1;
    int fnum = 1;
    for (int i = 0;i<n-2;i++) {
        fnum = prev1 + prev2;
        prev1 = prev2;
        prev2=fnum;
    }
    return fnum;
    }

    public static boolean isGoldenTriangle(int a, int b, int c) {
        if ((a == b) & (((double) c / a > 1.6170) & ((double) c / a < 1.61903))) return true;
        if ((a == c) & (((double) b / a > 1.6170) & ((double) b / a < 1.61903))) return true;
        if ((c == b) & (((double) a / c > 1.6170) & ((double) a / c < 1.61903))) return true;
        return false;
    }


    public static void main(String[] args) {
        System.out.println("Ряд Фибоначчи");
        for (int i = 1;i<16;i++)
        System.out.print(fiboNumber(i)+";   ");
        System.out.println();
        System.out.println("Золотые треугольники со сторонами от 1 до 100");
        for (int a=1;a<101;a++)
            for (int b=1;b<101;b++)
                for (int c=1;c<101;c++)
                if (isGoldenTriangle(a,b,c)) System.out.print(a+";"+b+";"+c+";   ");
    }
}