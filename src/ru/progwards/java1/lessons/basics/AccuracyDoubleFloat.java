package ru.progwards.java1.lessons.basics;

public class AccuracyDoubleFloat {
  //  если задавать R и Pi как константы, то добавляются строки
  //  static final double R = 6371.2d;
  //  static final double PI = 3.14;

    public static double volumeBallDouble(double radius){
        return 4.0/3.0*3.14*radius*radius*radius;
    }


    public static float volumeBallFloat(float radius) {
        return 4.0f / 3.0f * 3.14f* radius*radius*radius;
    }

    public static double calculateAccuracy (double radius)
    {
        return  volumeBallDouble(radius)-volumeBallFloat((float) radius);
    }

    public static void main(String[] args) {
        double x=5/2;
        System.out.println(x);
    }
}

