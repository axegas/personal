package personal;

import java.util.Scanner;

/*
 * Realiza un programa que, dado un día de la semana (de Lunes a Viernes) y una hora 
 * (horas y minutos),calcule cuántos minutos faltan para el fin de semana.Se considerará
 *  que el fin de semana comienza el viernes a las 14:00h. Lleva a cabo cuantasvalidaciones
 *   consideres necesarias para que el programa funcione correctamente.
 * 
 * 
 * 
 * 
 * 
 */
public class Ejer46 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String diaSe;
		int hora;
		int minu;
		int minu_total;
		int dia=0;
		int total=0;
		boolean finde = false;
		boolean corr = true;
		do {
			System.out.print("Introduce el dia de la semana (LU - VI): ");
			diaSe = scan.nextLine();
			diaSe = diaSe.toUpperCase();
			}while(!diaSe.equals("LU") & !diaSe.equals("MA") & !diaSe.equals("MI") & !diaSe.equals("JU")& !diaSe.equals("VI"));

		do {
			System.out.print("Introduce la hora: ");
			hora = scan.nextInt();
			System.out.print("Introduce los minutos: ");
			minu = scan.nextInt();			
			if(diaSe.equals("VI")) {
				if(hora>=14 & hora<24 & minu>=0 & minu <60) {
					finde=true;
				}else
					finde=false;
			}
				if(hora>=0 & hora<24 & minu>=0 & minu <60)
					corr = true;
				else
					corr=false;
					
		}while(!corr);
		
		int min_dia = minDiaSemana(diaSe,hora,minu);
		
		switch (diaSe) {
		case "LU":
			dia=1;
			break;
		case "MA":
			dia=2;
			break;
		case "MI":
			dia=3;
			break;
		case "JU":
			dia=4;
			break;
		case "VI":
			dia=5;
			break;
		}
			
		
		System.out.print("DIA: " + diaSe);
		System.out.printf(" HORA: %s MINU: %s: \n",hora,minu);
		int total_dia = diaSemana(diaSe,hora,minu);
		System.out.print("Te quedan: " + total);
		
		for(int i=dia+1;i<=5;i++) {
			total=total + total_dia;
		}
		

	}

	public static int minDiaSemana(String diaSe, int hora, int minu) {
		
		if(diaSe.equals("VI")) {
			return (14*60) - (hora*60+minu);
		}else {
			return (24*60) - (hora*60+minu);
		}
	}
	
	
	public static int diaSemana(String diaSe, int hora, int minu) {

		int minutos = hora*60+minu;
		int total =0;
		int minu_total = 24*60*4+14*60;
		
		switch(diaSe) {
			case "LU": 
				total=minu_total-minutos;
			break;
			case "MA":
				total = minu_total-minutos-24*60;
			break;
			case "MI":
				total = minu_total-minutos-24*60-24*60;
				break;
			case "JU":
				total = minu_total-minutos-24*60-24*60-24*60;
				break;
			case "VI":
				if(hora>=14 & hora<24 & minu>=0 & minu <60) {
					total = minu_total-minutos-24*60-24*60-24*60-14*60;	
				}
				break;
				}
		
		
		return total;
	}
	
	
}
