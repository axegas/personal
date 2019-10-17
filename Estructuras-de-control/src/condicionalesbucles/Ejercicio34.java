package condicionalesbucles;

import java.util.Scanner;

public class Ejercicio34 {		

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int cargo;
		int viaje;
		int estado;
		float sueldo=0;
		float base=0;
		float dietas;
		float retencion;
		float bruto;
		float irpf=0;
		float neto;
		float irpf2;
		
		do {
			System.out.println(" 1 - Prog. junior");
			System.out.println(" 2 - Prog. Senior");
			System.out.println(" 3 - Jefe de proyecto");
			System.out.println("Introduce tu cargo en la empresa (1,2 o 3): ");
			cargo = scan.nextInt();
		}while(cargo!=1 && cargo!=2 && cargo!=3);
		
		System.out.print("¿Cuantos días has estado de viaje?");
		viaje = scan.nextInt();
		
		do {
			System.out.print("Introduce tu estado civil (1-Soltero, 2-Casado:) ");
			estado = scan.nextInt();			
		}while(estado!=1 && estado!=2);
		
		switch(cargo)
		{
			case 1: base=950; break;
			case 2: base=1200; break;
			case 3: base=1600; break;		
		}
		
		dietas = viaje*30;
		bruto = base + dietas;
		
		if(estado==1) irpf = (float) 0.25;
		else if(estado==2) irpf = (float) 0.2;
		
		irpf2 = irpf*bruto;
		neto = bruto - irpf;
				
		System.out.println("[][][][][][][][][][][][][][][][][]");
		System.out.println("[]Sueldo Base:\t\t"+base+"\t[]");
		System.out.println("[]Dietas: ("+viaje+" viajes)\t"+dietas+"\t[]");
		System.out.println("[][][][][][][][][][][][][][][][][]");
		System.out.println("[]Sueldo Bruto:\t\t"+bruto+"\t[]");
		System.out.println("[]IRPF: ("+irpf+"%)\t\t"+irpf2+"\t[]");
		System.out.println("[][][][][][][][][][][][][][][][][]");
		System.out.println("[]Sueldo Neto:\t\t"+neto+"\t[]");
		System.out.println("[][][][][][][][][][][][][][][][][]");
	}

}
