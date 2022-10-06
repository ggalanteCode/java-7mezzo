package com.soprasteria.java7mezzo;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
		Scanner s = new Scanner(System.in);
		int[] mazzo = new int[40];
		int cartaEstratta;
		//generazione del mazzo di 40 carte tutte diverse
		for(int i = 0; i < mazzo.length; i++) {
			while(true) {
				boolean presente = false;
				cartaEstratta = r.nextInt(40)+1;
				for(int j = 0; j < 40; j++) {
					if(cartaEstratta == mazzo[j]) {	//ricerca lineare
						presente = true;
						break;
					}
				}
				if(!presente) {
					mazzo[i] = cartaEstratta;
					break;
				}
			}
			
			int contatoreMazzo=39, punteggioCarta, cartaEstrattaGiocatore, 
					cartaEstrattaBanco, punteggioGiocatore = 0, punteggioBanco = 0;
			boolean continuaAdEstrarre = false;
			String nomeCarta;
			
			System.out.println("Il giocatore chiede una carta al banco");
			cartaEstrattaGiocatore = mazzo[contatoreMazzo];
			contatoreMazzo--;
			
			
		}
	}

}
