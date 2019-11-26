package ru.progwards.java1.lessons.bitsworld;

public class CheckBit {

    public static int checkBit(byte value, int bitNumber){
        int rezult = 0;
        if ((bitNumber<0)|(bitNumber>7)){
            System.out.println("Неверно задано значение бита");
            return -1;
        }
        for (int i=0;i<=bitNumber;i++){
            rezult=(0b0000_0000_0000_0001&value);
            value= (byte) (value>>1);
        }
        return rezult;

    }


}
