package ru.progwards.java1.lessons.bitsworld;

public class bitsworld {
    public static int sumBits(byte value) {
        int rezult = 0;
        for (int i=0;i<8;i++){
        rezult=rezult+(0b0000_0000_0000_0001&value);
        value= (byte) (value>>1);
        }
        return rezult;
    }
}
