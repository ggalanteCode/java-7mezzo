package com.soprasteria.java7mezzo;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
		int[] mazzo = new int[40];
		int cartaEstratta;
		cartaEstratta = r.nextInt(40)+1;
		int j = 0;
		while(true) {
			if(mazzo[j] != 0 && cartaEstratta != mazzo[j]) {
				j++;
			} else {
				mazzo[j] = cartaEstratta;
				cartaEstratta = r.nextInt(40)+1;
				if(j==mazzo.length-1) {
					break;
				}
				j=0;
			}
		}
		
		Scanner s = new Scanner(System.in);
			
			int contatoreMazzo=39, cartaEstrattaGiocatore, 
					cartaEstrattaBanco, punteggioGiocatore = 0, punteggioBanco = 0;
			boolean continuaAdEstrarre = false;
			double punteggioCarta;
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
					punteggioCarta = moduloCarta;
					break;
				case 8:
					nomeCarta = "donna di ";
					punteggioCarta = 0.5;
					break;
				case 9:
					nomeCarta = "cavallo di ";
					punteggioCarta = 0.5;
					break;
				case 10:
					nomeCarta = "re di ";
					punteggioCarta = 0.5;
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
			
			s.close();
		}
}
