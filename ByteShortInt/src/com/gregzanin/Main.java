package com.gregzanin;

public class Main {

    public static void main(String[] args) {
	byte varByte1 = 100;
	short varShort1 = 50;
	int varInt1= -600;
	long varLong = 50000L + (10L * (varByte1 + varShort1 + varInt1));
        System.out.println("longTotal = " + varLong);
    }
}
