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
			String nomeCarta = "";
			
			do {
				System.out.println("Il giocatore chiede una carta al banco");
				cartaEstrattaGiocatore = mazzo[contatoreMazzo];
				contatoreMazzo--;
				
				int moduloCarta = cartaEstrattaGiocatore % 10;
				
				switch(moduloCarta) {
				case 1:
				case 2:
				case 3:
				case 4:
				case 5:
				case 6:
				case 7:
					nomeCarta = moduloCarta + " di ";
					break;
				case 8:
					nomeCarta = "donna di ";
					break;
				case 9:
					nomeCarta = "cavallo di ";
					break;
				case 10:
					nomeCarta = "re di ";
					break;
				}
				
				if(cartaEstrattaGiocatore > 0 && cartaEstrattaGiocatore <= 10) {
					nomeCarta = nomeCarta.concat("bastoni");
				} else if(cartaEstrattaGiocatore > 10 && cartaEstrattaGiocatore <= 20) {
					nomeCarta = nomeCarta.concat("coppe");
				} else if(cartaEstrattaGiocatore > 20 && cartaEstrattaGiocatore <= 30) {
					nomeCarta = nomeCarta.concat("denari");
				} else {
					nomeCarta = nomeCarta.concat("spade");
				}
				
				System.out.println("Estratto il " + nomeCarta);
				System.out.print("vuoi chiedere un'altra carta al banco? (true/false)");
				continuaAdEstrarre = s.nextBoolean();
			} while(continuaAdEstrarre && contatoreMazzo > 0);
			
			
		}
	}

}
