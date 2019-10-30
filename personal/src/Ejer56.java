import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Ejer56 {
	static Calendar cal= new GregorianCalendar();
	static Scanner scan = new Scanner(System.in);
	static SimpleDateFormat formatoDelTexto= new SimpleDateFormat();
	
	public static void main(String[] args) throws ParseException {
		int menu=0;

		Date fecha = new Date();
		
		do {
		System.out.println("1.- Obtener fecha actual");
		System.out.println("2.- Obtener hora actual");
		System.out.println("3.- Sumar días");
		System.out.println("4.- Diferencia en días");
		System.out.println("5.- Anterior o Posterior");
		System.out.println("9.- SALIR");
		menu = scan.nextInt();
		switch(menu) {
		case 1:
			obtenerFechaActual(fecha);
			break;
		case 2:
			obtenerHoraActual(fecha);
			break;
		case 3:
			sumarDias(fecha);
			break;
		case 4:
			diferenciaDias(fecha);
			break;
		case 5:
			anteriorOposterior(fecha);
			break;
		case 9:
			break;
		}
		}while(menu!=9);
		

	}
	public static void obtenerFechaActual(Date fecha) {
		formatoDelTexto= new SimpleDateFormat("dd-MM-YYYY");
		System.out.println("Fecha: " + formatoDelTexto.format(fecha));
	}
	public static void obtenerHoraActual(Date fecha) {		
		formatoDelTexto= new SimpleDateFormat("hh:mm:ss");
		System.out.println("Hora: " + formatoDelTexto.format(fecha));
	}
	public static void sumarDias(Date fecha) {
		System.out.print("Introduce los días a sumar: ");
		int dias = scan.nextInt();
		formatoDelTexto= new SimpleDateFormat("dd-MM-YYYY");
		cal.setTimeInMillis( fecha.getTime() );
		cal.add(Calendar.DATE, dias);
		
		Date fechaSuma = new Date(cal.getTimeInMillis());
		System.out.printf("Hoy mas %s días: %s\n", dias, formatoDelTexto.format(fechaSuma));		
	}
	public static void diferenciaDias(Date fecha) throws ParseException {
		scan.nextLine();
		formatoDelTexto = new SimpleDateFormat("DD/MM/YYYY");

		System.out.print("Introduce la fecha mayor a restar (DD/MM/AAAA): ");
		String fecha1 = scan.nextLine();
		Date fechaMayor = ParseFecha(fecha1);
		System.out.print("Introduce la fecha menor a restar (DD/MM/AAAA): ");
		String fecha2 = scan.nextLine();
		Date fechaMenor = ParseFecha(fecha2);
		
		
		long diferenciaEn_ms = fechaMayor.getTime() - fechaMenor.getTime();
		long dias = diferenciaEn_ms / (1000 * 60 * 60 * 24);
		
		System.out.printf("%s\t%s\t%s\n",formatoDelTexto.format(fechaMayor),formatoDelTexto.format(fechaMenor),dias);
		
	}
	
	public static void anteriorOposterior(Date fecha) throws ParseException {
		scan.nextLine();
		formatoDelTexto = new SimpleDateFormat("DD/MM/YYYY");

		System.out.print("Introduce la fecha: ");
		String fecha1 = scan.nextLine();
		Date fechaComparar = ParseFecha(fecha1);
		
		int comp = fechaComparar.compareTo(fecha);
		
		if(comp==0) System.out.println("Las fechas son iguales.");
		else if(comp<0) System.out.println("La fecha es anterior.");
		else System.out.println("La fecha es posterior.");		
	}






public static Date ParseFecha(String fecha) throws ParseException
{
	formatoDelTexto = new SimpleDateFormat("dd/MM/yyyy");
    Date fechaDate = new Date();
    fechaDate = formatoDelTexto.parse(fecha);
   
    return fechaDate;
}


}
