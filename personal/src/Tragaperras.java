
public class Tragaperras {

	public static void main(String[] args) {
		
		int tirada1 = (int) (Math.random()*5);
		int tirada2 = (int) (Math.random()*5);
		int tirada3 = (int) (Math.random()*5);

		mostrarTirada(tirada1);
		mostrarTirada(tirada2);
		mostrarTirada(tirada3);
		System.out.println("");
		if(tirada1==tirada2 & tirada2==tirada3) System.out.print("Enhorabuena, ha ganado 10 monedas");
		else if((tirada1==tirada2 & tirada2!=tirada3) | (tirada1!=tirada2 & tirada2==tirada3) | (tirada1==tirada3 & tirada3!=tirada2)) System.out.print("Bien, ha recuperado su moneda");
		else System.out.print("Lo siento, ha perdido");
	}
	
	public static void mostrarTirada(int num) {
		switch(num) {
		case 0:
			System.out.print("Corazon ");
			break;
		case 1:
			System.out.print("Diamante ");
			break;
		case 2:
			System.out.print("Herradura ");
			break;
		case 3:
			System.out.print("Campana ");
			break;
		case 4:
			System.out.print("Limón ");
			break;
		default:
			System.out.print("Incorrecta ");
			break;
		
		}
		
	}

}
