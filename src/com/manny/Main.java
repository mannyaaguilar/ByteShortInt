package com.manny;

public class Main {

    public static void main(String[] args) {

        //int has a width of 32
	    int myMinValue = -2_147_483_648;
	    int myMaxValue = 2_147_483_647;
	    int myTotal = (myMinValue/2);
        System.out.println("My Total = " + myTotal);

	    //byte has a width of 8
	    byte myByteValue = -128;
	    byte myNewByteValue = (byte) (myByteValue/2);
        System.out.println("My new byte value = " + myNewByteValue);

	    //short has a width of 16
	    short myShortValue = 32767;
	    short myNewShortValue = (short )(myShortValue/2);
        System.out.println("My new short value = " + myNewShortValue);

	    //long has a width of 64
	    long myLongValue = 9223_372_036_854_775_807L;
	    long myNewLongValue = (myLongValue/2);

	    byte byteValue = 10;
	    short shortValue = 20;
	    int intValue = 50;

	    long longTotal = 50000L + 10L * (byteValue + shortValue + intValue);
	    short shortTotal = (short) (1000 + 10 * (byteValue + shortValue + intValue));
        System.out.println("longTotal = " + longTotal);
		System.out.println("shortTotal = " + shortTotal);
    }
}
