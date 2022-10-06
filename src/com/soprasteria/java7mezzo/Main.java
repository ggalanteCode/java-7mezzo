package com.soprasteria.java7mezzo;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
		int[] mazzo = new int[40];
		int cartaEstratta;
		for(int i = 0; i < mazzo.length; i++) {
			while(true) {
				boolean presente = false;
				cartaEstratta = r.nextInt(40)+1;
				for(int j = 0; j < 40; j++) {
					if(cartaEstratta == mazzo[j]) {
						presente = true;
						break;
					}
				}
				if(!presente) {
					mazzo[i] = cartaEstratta;
					break;
				}
			}
		}
	}

}
