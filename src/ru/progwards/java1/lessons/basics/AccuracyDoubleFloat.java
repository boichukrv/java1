package ru.progwards.java1.lessons.basics;

public class AccuracyDoubleFloat {
  //  если задавать R и Pi как константы, то добавляются строки
  //  static final double R = 6371.2d;
  //  static final double PI = 3.14;

    public static double volumeBallDouble(double radius){
        return 4/3*3.14*radius;
    }


    public static float volumeBallFloat(float radius) {
        return 4 / 3 * 3.14f* radius;
    }

    public static double calculateAccuracy (double radius)
    {
        return  volumeBallDouble(radius)-volumeBallFloat((float) radius);
    }

}

