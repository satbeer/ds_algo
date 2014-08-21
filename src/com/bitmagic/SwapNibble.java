package com.bitmagic;

public class SwapNibble {

	public static void main(String[] args) {
		Byte b = new Byte((byte)70);
		System.out.println(Byte.toString(b));
		Byte newb = (byte) ((byte) ((b & 0x0F) << 4) | ((b & 0xF0) >> 4)); 
	}
}
